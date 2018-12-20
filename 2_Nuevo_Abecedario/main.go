package main

import ("fmt"
	"strings")

func main() {
	var n int
	var palabra string

	fmt.Scanln(&n)
	fmt.Scanln(&palabra)

	nuevaPalabra := make([]string, n)

	strings.Split(palabra, "")

	for i := 0; i < n; i++ {
		nuevaPalabra[i] = string(palabra[i])
		if palabra[i] == 'D' {
			nuevaPalabra[i] = "W"

			if i > 0 {
				if isVocal(string(palabra[i-1])) {
					nuevaPalabra[i] = "X"
				}
			}
		}
		if palabra[i] == 'd' {
			nuevaPalabra[i] = "w"

			if i > 0 {
				if isVocal(string(palabra[i-1])) {
					nuevaPalabra[i] = "x"
				}
			}
		}
	}

	println(strings.Join(nuevaPalabra,""))
}

func isVocal(a string) bool {
	vocales := []string{"A","E","I","O","U","a","e","i","o","u"}

	for _, b := range vocales {
		if b == a {
			return true
		}
	}
	return false
}
