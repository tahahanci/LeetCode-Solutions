total_points = gets.chomp
inside_circle = 0

total_points.to_i.times do
	x = rand
	y = rand
	if x**2 + y**2 <= 1
		inside_circle += 1
	end
end

pi = 4.0 * inside_circle / total_points.to_i
puts "Here is your PI estimation: #{pi}"