fun main() {
    val a = "������, ���!"
    val b = "����"
    val Message = shifr(a, b)
    println("������������� ���������: $Message")
    val decMessage = shifr(Message, b)
    println("�������������� ���������: $decMessage")
}
fun shifr(a: String, b: String): String {
    val alphabet = "�����Ũ��������������������������".toCharArray()
    val aC= a.uppercase().toCharArray()
    val bC = b.uppercase().toCharArray()
    val Message = StringBuilder()
    var bI = 0
    for (i in aC.indices) {
        val aCI = alphabet.indexOf(aC[i])
        if (aCI != -1) {
            val bCI = alphabet.indexOf(bC[bI])

            val Messageincr = (aCI + bCI) % alphabet.size
            Message.append(alphabet[Messageincr])
            bI = (bI + 1) % bC.size
        } else {
            Message.append(aC[i])
        }
    }
    return Message.toString()
}

