######################## NUMBER 1 Solve Me Second

def solveMeSecond (a, b)
    return a+b
end
t = gets.to_i
(0...t).each do |i|
    lis = gets.strip.split(" ")
    a = lis[0].to_i
    b = lis[1].to_i
    res = solveMeSecond(a,b)
    puts res
end

######################## NUMBER 2 Utopian Tree

t = gets.to_i

(0...t).each do |i|
  n = gets.to_i
  height = 1
  
  n.times do |cycle|
    height *= 2 if cycle % 2 == 0
    height += 1 if cycle % 2 == 1
  end
  
  puts height
end

######################## NUMBER 3 Maximizing XOR

def maxXor(l, r)
  max = 0
  l.upto(r) do | first |
    first.upto(r) do |second|
      max = first^second if first^second > max
    end
  end
  puts max
end
l = gets.to_i
r = gets.to_i
print maxXor(l, r)

######################## NUMBER 4 Service Lane

N, T = gets.strip.split(" ").map(&:to_i)
width = gets.strip.split(" ").map(&:to_i)

(0...T).each do |testcase|
  max_width = 3
  i, j = gets.strip.split(" ").map(&:to_i)
  i.upto(j) do | lane |
    max_width = width[lane] if width[lane] < max_width
  end
  puts max_width
end

######################## NUMBER 5 The Love-Letter Mystery

T = gets.to_i

(0...T).each do | palindrome |
  letters = gets.strip.split("")
  num_operations = 0
  
  letters.length.times do | idx |
    compare = letters[idx] <=> letters[-(idx + 1)]
    next if compare == 0
    while (compare != 0)
      if compare == -1
        letters[idx] = letters[idx].next
      else
        letters[-(idx + 1)] = letters[-(idx + 1)].next
      end
      num_operations += 1
      compare = letters[idx] <=> letters[-(idx + 1)]
    end
  end
  puts num_operations
end

#****************** Code below from xaenari

gets.to_i.times do
    str = gets.chomp.bytes.to_a
    puts str.zip(str.reverse).map{|x| x.reduce(:-).abs}.reduce(:+) / 2
end

