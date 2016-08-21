
import patmat.Huffman._


val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)

decode(t1, encode(t1)("acd".toList))

//encode(t1)("abcdef".toList)

decode(t1,List(0,1))

decode(t1,List(1,0))

encode(t1)("ab".toList)

/*


  }
 */