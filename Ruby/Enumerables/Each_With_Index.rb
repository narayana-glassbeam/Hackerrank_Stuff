def skip_animals(animals, skip)
  # Your code here
    skippedAnimals =[]
    animals.each_with_index {|item,index| skippedAnimals.push("#{index}:"+item) unless index < skip}
    skippedAnimals
end

#In this challenge, your task is to complete the skip_animals method that takes an animals array and a skip integer and returns an array of all elements except first skip number of items as shown in the example below.
