# Constants
TOTAL_POINTS = 1000000

def estimate_pi(total_points)
  points_inside_circle = 0
  total_points.times do
    x = rand
    y = rand
    points_inside_circle += 1 if x**2 + y**2 <= 1
  end
  4 * points_inside_circle.to_f / total_points
end

pi_estimate = estimate_pi(TOTAL_POINTS)
puts "Estimated value of pi: #{pi_estimate}"