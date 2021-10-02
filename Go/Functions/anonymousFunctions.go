package main

import (
	"fmt"
)

func main() {
	// Function with no name and is only used once
	// Simplest example
	func() {
		fmt.Println("Hello Go!")
	}() // this () is to invoke the function

	// Declare testFunc of type func
	var testFunc func() = func() {
		fmt.Println("Hello Again!")
	}
	// Invoke testFunc
	testFunc()
}
