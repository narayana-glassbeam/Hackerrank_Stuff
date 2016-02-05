def get_size(w,h,d)
  arr = Array.new
  arr[0] =(h*w+h*d+d*w)*2
  arr[1] = h*d*w
  arr
end

def get_size(w,h,d)
   [((2*w*d+(2*d*h)+(2*h*w))),(w*h*d)]
end

=begin
Description:

Write a function that returns the total surface area and volume of a box as an array: [area, volume].
=end
