from random import randint
def roll( num_dice,num_sides ):
	rolls = []
	sum = 0
	for x in range (0,num_dice):
		temp = randint(1,num_sides)
		sum += temp
		rolls.append(temp)
		x +=1
	rolls.append(sum)
	return rolls

if __name__ == "__main__":
	print roll(3,4)