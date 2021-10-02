package main

import (
	"fmt"
)

func main() {

	// Name := [size of array] type {}
	grades := [3]int{97, 85, 93}

	// ... means will allocate size which will fit the num of elements
	grades2 := [...]int{97, 85, 93}

	var students [3]string
	students[0] = "Lisa"
	students[1] = "Michelle"
	students[2] = "Ahmad"

	fmt.Printf("Grades: %v, Size: %v\n", grades, len(grades))
	fmt.Printf("Grades 2: %v, Size: %v\n", grades2, len(grades2))
	fmt.Printf("Students: %v, Size: %v\n\n\n", students, len(students))

	//*************************
	//**** Array Assignment ***
	// ************************
	arr1 := [3]int{1, 2, 3}

	// Unlike other language, assigning array will create a literal copy
	// To mimic behavior of other language, use [arr2 := &arr1] instead
	arr2 := arr1

	// Changing the value of arr2 will not affect the values in arr1
	arr2[1] = 100

	fmt.Printf("Arr1: %v\n", arr1)
	fmt.Printf("Arr2: %v\n\n\n", arr2)

	// ************************
	// ****** 2D Arrays *******
	// ************************
	var matrix [3][3]int = [3][3]int{
		[3]int{1, 0, 0},
		[3]int{0, 1, 0},
		[3]int{0, 0, 1}}

	fmt.Printf("Matrix: %v, Size: %v\n", matrix, len(matrix))
	fmt.Printf("Matrix 1: %v\n", matrix[0])
	fmt.Printf("Matrix 2: %v\n", matrix[1])
	fmt.Printf("Matrix 3: %v\n", matrix[2])
}
