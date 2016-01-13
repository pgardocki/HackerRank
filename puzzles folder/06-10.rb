######################## NUMBER 6 Lonely Integer

def  lonelyinteger(a)
  return a[0] if a.count == 1
  
  a.count.times do | idx |
    next if a.select { |num| num == a[idx]}.count == 2
    return a[idx]
  end
end
a = gets.strip.to_i
b = gets.strip.split(" ").map! {|i| i.to_i}
print lonelyinteger(b)

######################## NUMBER 7 Cut the Sticks

N = gets.to_i
sticks = gets.strip.split(" ").map(&:to_i)

while sticks.count > 0
  puts sticks.count
  min_stick = sticks.min
  sticks.map! { |stick| stick -= min_stick }.select!{ |stick| stick > 0 }
end

######################## NUMBER 8 Angry Professor

t = gets.to_i

(0...t).each do |i|
  n, k = gets.strip.split(" ").map(&:to_i)
  students = gets.strip.split(" ").map(&:to_i)
  
  puts students.select{ |student| student <= 0}.count >= k ? "NO" : "YES"
end

######################## NUMBER 9 Halloween Party

t = gets.to_i

(0...t).each do |i|
  k = gets.to_i
  puts (k / 2.0).floor * (k / 2.0).ceil
end

######################## NUMBER 10 Find Digits

t = gets.to_i

(0...t).each do |i|
  digits = gets.strip.split("").map(&:to_i)
  num = digits.join().to_i
  count = 0
  
  digits.count.times do |idx|
    next if digits[idx] == 0
    count += 1 if num % digits[idx] == 0
  end
  puts count
end