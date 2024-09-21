class Solution:
    def finalPositionOfSnake(self, n, commands):
        # Start at position (0, 0)
        row, col = 0, 0

        # Process each command
        for command in commands:
            if command == "UP":
                row -= 1
            elif command == "DOWN":
                row += 1
            elif command == "LEFT":
                col -= 1
            elif command == "RIGHT":
                col += 1

        # Convert the final (row, col) back to the 1D grid index
        return row * n + col

# Example 1
n = 2
commands = ["RIGHT", "DOWN"]
sol = Solution()
print(sol.finalPositionOfSnake(n, commands))  # Output: 3

# Example 2
n = 3
commands = ["DOWN", "RIGHT", "UP"]
print(sol.finalPositionOfSnake(n, commands))  # Output: 1

