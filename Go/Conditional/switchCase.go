package main

import (
	"fmt"
)

func main() {

	character := 'a'

	// break in Go is implied
	// can use fallthrough to execute the next case, just like other language without break
	switch character {
	case 'a':
		fmt.Println("Hello")
		fallthrough
	case 'b':
		fmt.Println("World")
	case 'c', 'd', 'e':
		fmt.Println("C, D, and E")
	default:
		fmt.Println("Nothing")
	}

	// ************************************
	// ******** TYPE SWITCH ***************
	// ************************************

	var i interface{} = 1
	switch i.(type) {
	case int:
		fmt.Println("i is Integer")
		break // use to short circuit the case and breakout
		fmt.Println("This statement is printed")
	case float64:
		fmt.Println("i i float64")
	case string:
		fmt.Println("i is String")
	}
}
