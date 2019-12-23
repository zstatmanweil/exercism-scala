object SpaceAge {
  def onEarth(seconds: Double) =
    seconds / 60 / 60 / 24 / 365.25

  def earthToPlanetYears(seconds: Double, earthYears: Double) =
    onEarth(seconds) / earthYears

  def onMercury(seconds: Double) =
    earthToPlanetYears(seconds,0.2408467)

  def onVenus(seconds: Double) =
    earthToPlanetYears(seconds,0.61519726)

  def onMars(seconds: Double) =
    earthToPlanetYears(seconds,1.8808158)

  def onJupiter(seconds: Double) =
    earthToPlanetYears(seconds,11.862615)

  def onSaturn(seconds: Double) =
    earthToPlanetYears(seconds,29.447498)

  def onUranus(seconds: Double) =
    earthToPlanetYears(seconds,84.016846)

  def onNeptune(seconds: Double) =
    earthToPlanetYears(seconds,164.79132)

}