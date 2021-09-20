package main

import (
	"fmt"
)

// Package level
const globalConst int = 100

// An enumerated constant
// 1st is 0, 2nd is 1 and so on
const (
	a int = iota
	b int = iota
	c int = iota
	d int = iota
)

func main() {

	// Using const keyword
	// Go constant naming convention
	// Unlike Java, do not use MYCONST, 1st char capital = export
	const myConst int = 42

	// Cannot assign new value to const
	// myConst = 10

	fmt.Printf("Value: %v, Type: %T\n", myConst, myConst)
	fmt.Printf("Value: %v, Type: %T\n", a, a)
	fmt.Printf("Value: %v, Type: %T\n", b, b)
	fmt.Printf("Value: %v, Type: %T\n", c, c)
	fmt.Printf("Value: %v, Type: %T\n", d, d)
}
