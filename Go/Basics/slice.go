package main

import (
	"fmt"
)

func main() {

	// Array has fix size, slice does not
	// Slice is declare by removing the size in the sq bracket
	// slicing applies to array as well
	a := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	a = append(a, 12)
	a = append(a, 13, 14, 15, 16)
	fmt.Printf("Slice a: %v, Size: %v, Capacity: %v\n", a, len(a), cap(a))

	// **********************************
	// ******** Removing elements *******
	// **********************************
	removedFirst := a[1:]
	fmt.Printf("Slice a removed first: %v, Size: %v, Capacity: %v\n", removedFirst, len(removedFirst), cap(removedFirst))

	removedLast := a[:len(a)-1]
	fmt.Printf("Slice a removed last: %v, Size: %v, Capacity: %v\n", removedLast, len(removedLast), cap(removedLast))

	// append first 3 elements with 5th elements onwards, i.e. remove index 3 / 4th element
	// Since can only append items of same type (i.e. int into int array, int array cannot append with int array),
	// must use the ..., aka spread operator, to add each individual elements into the array
	removedMiddle := append(a[:3], a[4:]...)
	fmt.Printf("Slice a removed middle: %v, Size: %v, Capacity: %v\n\n", removedMiddle, len(removedMiddle), cap(removedMiddle))

	// Slice of all elements
	b := a[:]

	// Slice from 4th element to the end
	c := a[3:]

	// Slice first 6 elements
	d := a[:6]

	// Slice the 4th, 5th and 6th elements
	// 1st number is inclusive, 2nd is exclusive
	e := a[3:6]

	fmt.Printf("Slice b: %v, Size: %v, Capacity: %v\n", b, len(b), cap(b))
	fmt.Printf("Slice c: %v, Size: %v, Capacity: %v\n", c, len(c), cap(c))
	fmt.Printf("Slice d: %v, Size: %v, Capacity: %v\n", d, len(d), cap(d))
	fmt.Printf("Slice e: %v, Size: %v, Capacity: %v\n\n\n", e, len(e), cap(e))

	// ****************************
	// ***** MAKE KEYWORD *********
	// ****************************

	// make takes in 2 or 3 arguments, (type, size, capacity)
	makeDemo := make([]int, 3, 100)
	fmt.Printf("Slice makeDemo: %v, Size: %v, Capacity: %v\n", makeDemo, len(makeDemo), cap(makeDemo))

}
