######################## NUMBER 16 Sherlock and Squares

t = gets.to_i

(0...t).each do |i|
  a, b = gets.strip.split(" ").map(&:to_i)
  squares = 0
  1.upto(b) do |num|
    squares += 1 if (num**2 >=a) and (num**2 <= b)
    break if num**2 > b
  end
  puts squares
end

######################## NUMBER 17 Sherlock and GCD (*** SUBSETS ***)

require 'prime'

def gcd(a, b)
   return a if b == 0
   return gcd(b, a % b)
end

t = gets.to_i

(0...t).each do |i|
  size = gets.to_i
  array = gets.strip.split(" ").map(&:to_i).uniq.sort
  
  primes = 0
  prime_num = 0
  array.each do |num|
    if Prime.prime?(num)
      primes += 1 
      break if primes > 1
      prime_num = num
    end
  end
  
  exists = "NO"
  if array.include?(1)
    exists = "YES"
  elsif array.count == 1
    exists = "NO"
  elsif primes > 1
    exists = "YES"
  elsif primes == 1
    array.each do |num|
      exists = "YES" if gcd(num, prime_num) == 1
    end
  else
    simplify = gcd(array[0], array[1])
    solved = ""
    if simplify > 1
      if array.all? { |num| num % simplify == 0 }
        solved = "true"
      end
    end      
    
    2.upto(array.count) do |pairs|
      break if solved == "true"
      break if exists == "YES"
      subsets = []
      subsets += array.combination(pairs).to_a      
      
      subsets.each do |set|
        break if exists == "YES"
        divider = set[0]
        1.upto(set.count - 1) do |idx|
          divider = gcd(set[idx], divider)
          if divider == 1
            exists = "YES"
            break
          end
        end
      end
      
    end
  end
  puts exists
end

######################## NUMBER 18 Sherlock and The Beast (terminated due to timeout)

t = gets.to_i

def descent_num(n)
  return [-1] if n <= 0
  threes = fives = 0
  
  while n > 0
    if n % 3 != 0
      fives += 1
      n -= 5
      next
    else
      threes = n / 3
      n = 0
      break
    end    
  end
  return n == 0 ? [fives, threes] : [-1]
end

(0...t).each do |testcase|
  n = gets.to_i
  descent = descent_num(n)  
  p descent.count == 1 ? -1 : ("5" * (descent[1] * 3) + "3" * (descent[0] * 5)).to_i
end

######################## NUMBER 19 Filling Jars

n, m = gets.split.map(&:to_i)
nums = []
(0...m).each do |addition|
  start, stop, amount = gets.split.map(&:to_i)
  nums << (stop - start + 1) * amount
end
puts nums.reduce(:+) / n

######################## NUMBER 20 Max Min

n = gets.to_i
k = gets.to_i
candy = Array.new(n)
for i in 0..n-1
  candy[i] = gets.to_i
end
candy.sort!
ans = candy[k - 1] - candy[0]
cycles = n - k + 1
cycles.times do |diff|
  ans = [candy[diff + k - 1] - candy[diff], ans].min
end
puts ans