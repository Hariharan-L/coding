def rainwater_storage(heights):
    n = len(heights)
    left=heights[0]
    right=heights[n-1]
    

# Example usage:
heights = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
result = rainwater_storage(heights)
print(f"Amount of rainwater that can be stored: {result} units")
