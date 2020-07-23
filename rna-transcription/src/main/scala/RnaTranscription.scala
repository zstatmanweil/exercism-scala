object RnaTranscription {
  val transcription =
    Map('G' -> 'C',
    'C' -> 'G',
    'T' -> 'A',
    'A' -> 'U')

  def toRna(dnaStrand: String): Option[String] = {
    Option(dnaStrand.map(transcription(_)))
  }
}