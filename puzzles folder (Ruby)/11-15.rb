######################## NUMBER 11 Chocolate Feast

t = gets.to_i

t.times{
  (money, cost, tradein) = gets.split.map{|i| i.to_i}
  
  chocolates = (money / cost)
  wrappers = (money / cost)
  
  while wrappers >= tradein
    new_chocolates = wrappers / tradein
    chocolates += new_chocolates
    wrappers = (wrappers % tradein) + new_chocolates
  end
  
  puts chocolates
}

######################## NUMBER 12 Cavity map

n = gets.to_i
array = []
n.times { array << gets.strip.split("").map(&:to_i) }

array.each_with_index do |ary, idx|
  puts ary.join() if idx == 0 || idx == (array.count - 1)
  next if idx == 0 || idx == (array.count - 1)
  ary.each_with_index do |_, idx2|
    next if idx2 == 0 || idx2 == (ary.count - 1)
    neighbors = [ary[idx2 - 1], ary[idx2 + 1], array[idx - 1][idx2], array[idx + 1][idx2]]
    next if neighbors.include?("X")
    ary[idx2] = "X" if neighbors.max < ary[idx2]
  end
  puts ary.join()
end

######################## NUMBER 13 Manasa and Stones

t = gets.to_i

(0...t).each do |i|
  stones = gets.to_i
  a = gets.to_i
  b = gets.to_i

  possible_outputs = []
  
  stones.times do |cycle|
    coefficient_a = (stones - 1) - cycle
    coefficient_b = cycle
    possible_outputs << ((a * coefficient_a) + (b * coefficient_b))
  end
  puts possible_outputs.uniq.sort.join(" ")
end

######################## NUMBER 14 ACM ICPC Team

people, topics = gets.strip.split(" ").map(&:to_i)

topics_array = []
people.times { topics_array << gets.strip.split("").map(&:to_i) }

max_knowledge = 0
teams_with_max_knowledge = 0

topics_array.each_with_index do |ary, idx|
  topics_array.each_with_index do |ary2, idx2|
    next if idx2 <= idx
    
    knowledge = ary.dup
    topics.times { |topic| knowledge[topic] = 1 if ary2[topic] == 1 }
    
    total_knowledge = knowledge.inject(:+)
    
    if total_knowledge > max_knowledge
      max_knowledge = total_knowledge
      teams_with_max_knowledge = 1
    elsif total_knowledge == max_knowledge
      teams_with_max_knowledge += 1
    end
  end
end
puts max_knowledge, teams_with_max_knowledge  

######################## NUMBER 15 Taum and B'day

t = gets.to_i

(0...t).each do |i|
  b , w = gets.strip.split(" ").map(&:to_i)
  b_cost, w_cost, tradein = gets.strip.split(" ").map(&:to_i)
  
  total_cost = 0
  if b_cost > (w_cost + tradein)
    total_cost = (w * w_cost) + (b * (w_cost + tradein))
  elsif w_cost > (b_cost + tradein)
    total_cost = (b * b_cost) + (w * (b_cost + tradein))
  else
    total_cost = (w * w_cost) + (b * b_cost)
  end
  puts total_cost
end
