package main

import (
	"fmt"
)

func main() {
	dataType()
}

// Primitives data type
func dataType() {

	// boolean
	var booleanVar bool = true
	booleanVar2 := 1 == 2
	fmt.Printf("Boolean primitive type: %T, %v\n", booleanVar, booleanVar)
	fmt.Printf("Boolean primitive type: %T, %v\n\n", booleanVar2, booleanVar2)

	// signed integer
	var signedInt int32 = 30
	fmt.Printf("Signed Integer primitive type: %T, %v\n\n", signedInt, signedInt)

	// unsigned integer (+ve only)
	var unsignedInt uint32 = 50
	fmt.Printf("Unsigned Integer primitive type: %T, %v\n\n", unsignedInt, unsignedInt)

	// float (float32 and float64 cannot work with each other)
	var floatVar float32 = 34.1
	fmt.Printf("Float primitive type: %T, %v\n\n", floatVar, floatVar)

	// complex
	var complexVar complex64 = 1 + 2i
	fmt.Printf("Complex primitive type: %T, %v\n", complexVar, complexVar)
	fmt.Printf("Complex Real Component: %T, %v\n", real(complexVar), real(complexVar))
	fmt.Printf("Complex Imaginary Component: %T, %v\n\n", imag(complexVar), imag(complexVar))

	var complexVar2 complex128 = complex(5, 12)
	fmt.Printf("Complex primitive type: %T, %v\n", complexVar2, complexVar2)
	fmt.Printf("Complex Real Component: %T, %v\n", real(complexVar2), real(complexVar2))
	fmt.Printf("Complex Imaginary Component: %T, %v\n\n", imag(complexVar2), imag(complexVar2))

	//string utf-8
	str := "This is a string literal"
	fmt.Printf("String type: %T, %v\n\n", str, str)
	fmt.Printf("Accessing 3rd character: %T, %v\n\n", str[2], string(str[2]))

	// string utf-32 aka rune
	var r rune = 'a'
	fmt.Printf("Rune type: %T, %v", r, r)

}
