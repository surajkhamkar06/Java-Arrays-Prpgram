package package1;

public class ContainerWithMostWater 
{
	// Method to calculate the maximum area
	public int maxArea(int[] height) 
	{
		int left = 0;
		int right = height.length - 1;
		int maxWater = 0;

		while (left < right)
		{
			int width = right - left;
			int ht = Math.min(height[left], height[right]);
			int area = width * ht;
			maxWater = Math.max(maxWater, area);

			// Move the pointer pointing to the shorter line
			if (height[left] < height[right])
			{
				left++;
			} else {
				right--;
			}
		}

		return maxWater;
	}

	// Main method to test the code
	public static void main(String[] args)
	{
		ContainerWithMostWater sol = new ContainerWithMostWater();

		// Sample input
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

		// Call the method and print the result
		int result = sol.maxArea(height);
		System.out.println("Maximum water that can be contained: " + result);
	}
}