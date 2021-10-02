package main

import (
	"fmt"
)

func main() {

	// for loop in Go
	for i := 0; i < 5; i++ {
		// fmt.Println((i))
		if i == 4 {
			break
		} else if i == 1 {
			continue
		}
	}

	// Breaking out of nested loop
Loop: // label
	for i := 0; i < 10; i++ {
		for j := 0; j < 10; j++ {
			if j >= 3 {
				// will break out of even outer loop
				break Loop
			}
		}
	}

	// Working with collections
	arr := []int{1, 2, 3}
	for key, value := range arr {
		// key is the index, value is the actual value
		fmt.Println(key, value)
	}

	// When you need either only the key or the value
	statePopulations := map[string]int{
		"California":   39250017,
		"Texas":        27862596,
		"Florida":      20612439,
		"New York":     19745289,
		"Pennsylvania": 12802503,
		"Illinois":     12801539,
		"Ohio":         11614373,
	}
	// use a _ to indicate the key or value is not needed
	for _, value := range statePopulations {
		fmt.Println(value)
	}

	// Working with Strings
	str := "Hello World"
	for key, value := range str {
		fmt.Println(key, string(value))
	}
}
