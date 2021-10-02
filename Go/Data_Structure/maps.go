package main

import (
	"fmt"
	"strconv"
)

func main() {
	// ********************************
	// ********** GO Maps *************
	// ********************************

	// Order is not guaranteed
	statePopulations := map[string]int{
		"California":   39250017,
		"Texas":        27862596,
		"Florida":      20612439,
		"New York":     19745289,
		"Pennsylvania": 12802503,
		"Illinois":     12801539,
		"Ohio":         11614373,
	}

	// Another way to create map
	statePopulations2 := make(map[string]int)

	fmt.Println(statePopulations)
	fmt.Println(statePopulations2)

	// ********************************
	// ******* Data Manipulation ******
	// ********************************

	// Add new key value pair
	statePopulations["Georgia"] = 10310371

	// Delete a key value pair
	// When a key is missing from the map, retrieving the missing key will return 0
	// Can be dangerous ==> use , ok
	delete(statePopulations, "Georgia")

	// testPop will be 0, the ok is a var to tell if the key exist
	//testPop, ok := statePopulations["Georgia"]
	if testPop, ok := statePopulations["Georgia"]; ok {
		fmt.Println("Population in Georgia: " + strconv.Itoa(testPop) + "\nGeorgia exist in map: " + strconv.FormatBool(ok))
	} else {
		fmt.Println("Georgia no exist")
	}

	// Must use strconv.Itoa(int) when we want to convert int to string
	fmt.Println("Number of populations in Ohio: " + strconv.Itoa(statePopulations["Ohio"]))
}
