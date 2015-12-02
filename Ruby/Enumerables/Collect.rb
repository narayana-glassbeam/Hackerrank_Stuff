def rot13(secret_messages)
  # your code here
    secret_messages.map {|word| word.tr('A-Za-z', 'N-ZA-Mn-za-m') }
end

#In this challenge, your task is to write a method which takes an array of strings (containing secret enemy message bits!) and decodes its elements using ROT13 cipher system; returning an array containing the final messages.
