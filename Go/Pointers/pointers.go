package main

import (
	"fmt"
)

func main() {
	pointerArithmetic()
}

func pointersBasic() {
	var a int = 42

	// b is holding the memory location of a
	var b *int = &a

	fmt.Println(a, b)
	fmt.Println(&a, b)
	fmt.Println(a, *b)

	fmt.Println("\n\nChanging value of a")
	a = 500
	fmt.Println(a, b)
	fmt.Println(&a, b)
	fmt.Println(a, *b)
}

func pointerArithmetic() {
	arr := [3]int{1, 2, 3}

	// a and b are 4 bytes apart
	a := &arr[0]
	b := &arr[1]
	fmt.Printf("%v %p %p\n", arr, a, b)
}
