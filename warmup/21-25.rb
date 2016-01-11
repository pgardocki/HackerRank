######################## NUMBER 21 Song of Pi

pi = "31415926535897932384626433833"
n = gets.to_i

(0...n).each do |testcase|
  text = gets.split.map { |word| word.length.to_s }
  length = text.length
  puts text.join == pi[0...length] ? "It's a pi song." : "It's not a pi song."
end

######################## NUMBER 22 Identify Smith Numbers

require 'prime'

number = gets.to_i
sum_digits = number.to_s.split('').map(&:to_i).reduce(:+)

primes = []

unless Prime.prime?(number)
  Prime.each(number) do |prime|
    break if Prime.prime?(number)
    while number % prime == 0
      primes << prime
      number /= prime
      if Prime.prime?(number)
        primes << number
        break
      end
    end
  end
end

sum_primes = primes.map { |num| num.to_s.split('') }.flatten.map(&:to_i).reduce(:+)
puts sum_digits == sum_primes ? 1 : 0

######################## NUMBER 23 The Time In Words

nums = [ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", 
  "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", 
  "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"]

first = gets.to_i
second = gets.to_i

if second < 31  
  case second
  when 00 then puts "#{nums[first]} o' clock"
  when 01 then puts "one minute past #{nums[first]}"
  when 15 then puts "quarter past #{nums[first]}"
  when 30 then puts "half past #{nums[first]}"
  else
    puts "#{nums[second]} minutes past #{nums[first]}"
  end
else
  case second
  when 45 then puts "quarter to #{nums[first + 1]}"
  else
    second = 60 - second
    puts "#{nums[second]} minutes to #{nums[first + 1]}"
  end
end

######################## NUMBER 24 Modified Kaprekar Numbers

one, two = gets.to_i, gets.to_i
kaprekar = []

(one..two).each do |num|
  right, left = (num**2).to_s.reverse.chars.each_slice(((num**2).to_s.length / 2.0).ceil).map(&:join)
  left ||= "0"
  kaprekar << num if right.reverse.to_i + left.reverse.to_i == num
end

puts kaprekar.empty? ? "INVALID RANGE" : kaprekar.join(" ")

######################## NUMBER 25 Is Fibo

def gen_fibo(num, fibo = [0, 1, 1])
  return fibo if fibo.last > num
  fibo << fibo[-1] + fibo[-2]
  gen_fibo(num, fibo)
end

t = gets.to_i
(0...t).each do |testcase|
  num = gets.to_i
  puts gen_fibo(num).include?(num) ? "IsFibo" : "IsNotFibo"
end
