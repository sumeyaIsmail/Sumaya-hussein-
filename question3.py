def count_ways(coins, amount):
    # Initialize an array to store the number of ways to make change
    ways = [0] * (amount + 1)
    # Base case: there is 1 way to make change for 0 amount
    ways[0] = 1
    for coin in coins:
        for i in range(coin, amount + 1):
            ways[i] += ways[i - coin]
    return ways[amount]

# Example usage:
coins = [5, 8, 4]
amount = 5
print(count_ways(coins, amount)) # prints 1
