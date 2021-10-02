package main

import (
	"fmt"
	"strconv"
)

func main() {
	// Functions with unknown number of parameter
	result1 := sum(1, 2, 3, 4, 5)
	result2 := sum(5, 6, 7)

	print("Result1 is " + strconv.Itoa(result1))
	print("Result2 is " + strconv.Itoa(result2))

	print("\n\n")

	// when receiving multiple variables, must have declaration separated by commas
	floatResult, err := divide(5.0, 0.0)
	if err != nil {
		fmt.Println(err)
		return
	}

	// To convert float to string, use fmt.Sprintf
	print(fmt.Sprintf("%f", floatResult))
}

// Can return multiple variables
func divide(a, b float64) (float64, error) {
	if b == 0.0 {
		return 0.0, fmt.Errorf("Cannot divide by 0")
	}
	// No error, return nil as error
	return a / b, nil
}

// There can only be 1 variadic parameter and must be the last parameter
// This function has return type int
func sum(values ...int) int {
	fmt.Println(values)
	result := 0

	for _, v := range values {
		result += v
	}
	//fmt.Println("The sum is ", result)
	return result
}

func print(str string) {
	fmt.Println(str)
}
