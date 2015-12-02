#In this challenge, you have been provided with a custom object called colors that defines it's own each method. You need to iterate over the items and return an Array containing the values.

def iterate_colors(colors)
  # Your code here
    array = Array.new
    colors.each do |item|
        array.push(item)
    end
    array
end

