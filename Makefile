all:
	gcc -Wall --pedantic -g src/*.c -o bin/gra_w_zycie -lpng
test:
	gcc -Wall --pedantic testy/testclearbuffer.c -o testy/testclearbuffer
	gcc -Wall --pedantic testy/testneighbours.c src/gra.c src/png.c -lpng -o testy/testneighbours
testneighbours: test
	testy/testneighbours dane/przykladbuffer.txt
testclearbuffer: test
	testy/testclearbuffer dane/przyklad3.txt
