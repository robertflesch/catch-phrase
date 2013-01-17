package models.games.shibboleth

object ShibbolethRepository {
  def apply() = new ShibbolethRepository()
}

class ShibbolethRepository {
  private val shibboleths = Array(Shibboleth("I pity the fool", "Mr. T", "Media appearance", 1982),
    Shibboleth("Beam me up, Scotty", "(never used in any episode or film)", "Star Trek", 1960),
    Shibboleth("Live long and prosper", "Spock", "Star Trek", 1967), Shibboleth("Who loves ya, baby?", "Theo Kojak", "Kojak", 1973),
    Shibboleth("How did I not see that coming?", "Silver", "The Silver show", 2012),
    Shibboleth("Resistance is futile", "The Borg", "Star Trek", 1987),
    Shibboleth("Where's the beef?", "Clara Peller", "Commercial, Wendy's", 1984),
    Shibboleth("Respect my authori-tah!", "Eric Cartman", "South Park", 1997),
    Shibboleth("It's 1 vs. 100!", "Bob Saget/Carrie Ann Inaba", "1 vs. 100", 2006),
    Shibboleth("Zoinks!", "Shaggy", "Scooby Doo, Where Are You!", 1969),
    Shibboleth("Let's get ready to rumble!", "Michael Buffer", "Media appearance", 1984),
    Shibboleth("More cowbell", "The Bruce Dickinson", "Saturday Night Live", 2000),
    Shibboleth("Git-R-Done!", "Larry the Cable Guy", "Comedy monologue", 1991),
    Shibboleth("Time for Time Force!", "Time Force Rangers", "Power Rangers Time Force", 2001),
    Shibboleth("Dyn-o-mite!", "J.J. Walker", "Good Times", 1974),
    Shibboleth("One ringy-dingy...two ringy-dingies...", "Ernestine", "Rowan & Martin's Laugh-In", 1970),
    Shibboleth("Here come de judge!", "Pigmeat Markham", "Comedy monologue", 1940),
    Shibboleth("Magical source, Mystic Force!", "Mystic Force Rangers", "Power Rangers Mystic Force", 2006),
    Shibboleth("And that's the way it is", "Walter Cronkite", "Liberty's Kids", 2002),
    Shibboleth("Holy mackerel!", "Kingfish", "Amos 'n' Andy Show", 1928),
    Shibboleth("It's hero time", "Ben Tennyson", "Ben 10", 2005),
    Shibboleth("Worst [noun] ever!", "Comic Book Guy", "The Simpsons", 1991),
    Shibboleth("Scooby dooby doo!", "Scooby Doo", "Scooby Doo, Where Are You!", 1969),
    Shibboleth("Go Home, Roger", "Tia Landry and Tamera Campbell", "Sister, Sister", 1994),
    Shibboleth("I got it, mom!", "Flynn Jones", "Shake it Up", 2010),
    Shibboleth("Jinkies!", "Velma", "Scooby Doo, Where Are You!", 1969),
    Shibboleth("¡Ay, caramba!", "Bart Simpson", "The Simpsons", 1989),
    Shibboleth("Man's best friend", "George Graham Vest", "Courtroom speech", 1870),
    Shibboleth("Get the Steppin'", "Martin Payne", "Martin", 1992),
    Shibboleth("Oh, man!", "Swiper the Fox", "Dora the Explorer", 2000),
    Shibboleth("You are the official winners of the Amazing Race!", "Phil Keoghan", "The Amazing Race", 2001),
    Shibboleth("Survey says...", "Multiple people", "Family Feud", 1976),
    Shibboleth("Yes, yes I am.", "Phineas", "Phineas and Ferb", 2007),
    Shibboleth("KnoWhutImean? (Vern)", "Ernest P. Worrell", "Commercial", 1980),
    Shibboleth("Sorry, Charlie", "Charlie the Tuna", "Commercial, StarKist", 1961),
    Shibboleth("Up your nose with a rubber hose!", "Vinnie Barbarino", "Welcome Back, Kotter", 1975),
    Shibboleth("You are so busted!", "Candace", "Phineas and Ferb", 2007),
    Shibboleth("Can't we all just get along?", "Rodney King", "Press conference", 1991),
    Shibboleth("It's Morphin' time!", "Power Rangers", "Mighty Morphin' Power Rangers", 1993),
    Shibboleth("Rangers together, Samurai forever!", "Samurai Power Rangers", "Power Rangers Samurai", 2011),
    Shibboleth("The Tribe has spoken.", "Jeff Probst", "Survivor", 2000),
    Shibboleth("Curse you Perry the Platypus!", "Dr. Doofenshmirtz", "Phineas and Ferb", 2007),
    Shibboleth("Good luck Charlie!", "Teddy Duncan", "Good Luck Charlie", 2010),
    Shibboleth("This is Shake it Up Chicago!", "Gary Wilde", "Shake it Up", 2010),
    Shibboleth("Wii would like to play.", "Multiple people", "Commercial, Wii", 2006),
    Shibboleth("I'm sorry to tell you that you have been eliminated from the race.", "Phil Keoghan", "The Amazing Race", 2001),
    Shibboleth("I'm a doctor, not a...", "Leonard \"Bones\" McCoy", "Star Trek", 1966),
    Shibboleth("For now, Dick Clark. So long!", "Dick Clark", "Media appearances", 1950),
    Shibboleth("That's a joke, son!", "Senator Claghorn", "The Fred Allen Show", 1945),
    Shibboleth("Phineas and Ferb are making a title sequence!", "Candace", "Phineas and Ferb", 2007),
    Shibboleth("Hey there, Boo Boo!", "Yogi Bear", "The Yogi Bear Show", 1961),
    Shibboleth("Pay attention now, boy!", "Senator Claghorn", "The Fred Allen Show", 1945),
    Shibboleth("Well, isn't that SPE-CIAL?!", "The Church Lady", "Saturday Night Live", 1986),
    Shibboleth("Taste the Rainbow.", "Multiple people", "Commercial, Skittles", 2010),
    Shibboleth("What'chu talkin' 'bout, Willis", "Arnold Jackson", "Diff'rent Strokes", 1978),
    Shibboleth("Samurai Rangers, victory is ours!", "Samurai Power Rangers", "Power Rangers Samurai", 2011),
    Shibboleth("Yeah! That's the ticket!", "Tommy Flanagan", "Saturday Night Live", 1985),
    Shibboleth("There can be only one", "Immortals", "Highlander", 1986),
    Shibboleth("This is American Idol!", "Ryan Seacrest", "American Idol", 2002),
    Shibboleth("Excuse Me", "Steve Martin", "Comedy monologue", 1977), Shibboleth("D'oh!", "Homer Simpson", "The Simpsons", 1989),
    Shibboleth("Kumbaya!", "Eek! The Cat", "Eek! The Cat", 1992), Shibboleth("How You Doin'?", "Matt LeBlanc", "Friends", 1994),
    Shibboleth("Bazinga!", "Sheldon Cooper", "The Big Bang Theory", 2007),
    Shibboleth("Yada, yada, yada", "Multiple characters", "Seinfeld", 1997),
    Shibboleth("Deal or No Deal.", "Howie Mandel", "Deal or No Deal", 2005),
    Shibboleth("What a revoltin' development this is!", "Chester A. Riley", "The Life of Riley", 1945),
    Shibboleth("Denial ain't just a river in Egypt!", "Stuart Smalley", "Saturday Night Live", 1991),
    Shibboleth("Thank you, thank you very much", "Elvis Presley", "Concert", 1958),
    Shibboleth("Welcome to Good Burger, home of the Good Burger. Can I take your order?", "Kel Mitchell", "All That", 1996),
    Shibboleth("Do you want the money, or the mob?", "Bob Saget/Carrie Ann Inaba", "1 vs. 100", 2006),
    Shibboleth("Oh my God! They killed Kenny!", "Stan Marsh/Kyle Broflovski", "South Park", 1997),
    Shibboleth("Swiper, no swiping!", "Multiple characters", "Dora the Explorer", 2000),
    Shibboleth("Here I come to save the day!", "Mighty Mouse", "Various Mighty Mouse cartoons", 1941),
    Shibboleth("You bet your sweet bippy!", "Rowan & Martin", "Rowan & Martin's Laugh-In", 1968),
    Shibboleth("Yo Gabba Gabba!", "DJ Lance", "Yo Gabba Gabba!", 2007),
    Shibboleth("Wild Access!", "Wild Force Rangers", "Power Rangers Wild Force", 2002),
    Shibboleth("Oh, there you are Perry.", "Phineas", "Phineas and Ferb", 2007),
    Shibboleth("Open the case.", "Howie Mandel", "Deal or No Deal", 2005),
    Shibboleth("Come on down!", "Multiple announcers", "The Price is Right", 1972),
    Shibboleth("Live from New York, it's Saturday Night!", "Multiple people", "Saturday Night Live", 1975),
    Shibboleth("I'm smarter than the average bear!", "Yogi Bear", "The Yogi Bear Show", 1961),
    Shibboleth("This is SportsCenter!", "Multiple people", "SportsCenter", 1988),
    Shibboleth("Hey, where's Perry?", "Phineas", "Phineas and Ferb", 2007),
    Shibboleth("Hey you guys!", "Multiple people", "The Electric Company", 1971),
    Shibboleth("Did I do that?", "Steven Urkel", "Family Matters", 1989),
    Shibboleth("Caso Cerrado!", "Ana Maria Polo", "Caso Cerrado", 2001),
    Shibboleth("How You Doin'?", "Wendy Williams", "The Wendy Williams Show", 2008),
    Shibboleth("The world is waiting for you. Travel safe... GO!", "Phil Keoghan", "The Amazing Race", 2001),
    Shibboleth("Bite my shiny metal ass", "Bender", "Futurama", 1999),
    Shibboleth("Excellent!", "Montgomery Burns", "The Simpsons", 1989),
    Shibboleth("Like buttah", "Linda Richman", "Saturday Night Live", 1991),
    Shibboleth("What you see is what you get", "Geraldine Jones", "Rowan & Martin's Laugh-In", 1968),
    Shibboleth("I'm ready!", "SpongeBob SquarePants", "SpongeBob SquarePants", 1999),
    Shibboleth("Look that up in your Funk and Wagnalls!", "Pigmeat Markham", "Comedy monologue", 1940),
    Shibboleth("You got a minute to win it!", "Guy Fieri", "Minute to Win It", 2010),
    Shibboleth("Do you have it?", "Mike O'Malley", "GUTS", 1992),
    Shibboleth("Turn on, tune in, drop out", "Timothy Leary", "Human Be-In", 1967),
    Shibboleth("He's dead, Jim", "Leonard \"Bones\" McCoy", "Star Trek", 1966),
    Shibboleth("Gabba Gabba Hey", "Ramones", "Pinhead (song)", 1977),
    Shibboleth("You know what? I'm the hero", "Droopy", "Dumb-Hounded", 1943),
    Shibboleth("Is that your final answer?", "Regis Philbin/Meredith Vieira", "Who Wants to Be a Millionaire?", 1999),
    Shibboleth("How U will play next?", "Multiple people", "Commercial, Wii U", 2012),
    Shibboleth("Oh My God!", "Maggie Wheeler", "Friends", 1994),
    Shibboleth("I'm going ghost!", "Danny Phantom", "Danny Phantom", 2007),
    Shibboleth("R, S, T, L, N, E", "Pat Sajak", "Wheel of Fortune", 1984),
    Shibboleth("You look... mahvelous!", "Fernando Lamas", "Saturday Night Live", 1985),
    Shibboleth("It's not just letters, it's Lingo!", "Chuck Woolery", "Lingo", 2002),
    Shibboleth("Hug me, brother!", "Josh Peck", "Drake & Josh", 2004),
    Shibboleth("Power Surge!", "Mike O'Malley", "Get the Picture", 1991),
    Shibboleth("Book 'em, Danno", "Steve McGarrett", "Hawaii Five-O", 1968),
    Shibboleth("I see nothing–NOTHING!", "Sergeant Schultz", "Hogan's Heroes", 1965),
    Shibboleth("I get no respect, I tell ya", "Rodney Dangerfield", "Comedy monologue", 1962),
    Shibboleth("Yabba dabba doo!", "Fred Flinstone", "The Flinstones", 1961),
    Shibboleth("Whassup?", "A group of friends", "Commercial, Budweiser", 1999),
    Shibboleth("Alvin!", "Dave Seville", "Alvin & the Chipmunks", 1983),
    Shibboleth("Dear Ashley... that's me!", "Amanda Bynes", "All That", 1996),
    Shibboleth("You are the Weakest Link! Goodbye!", "Anne Robinson/George Gray", "The Weakest Link", 2001),
    Shibboleth("How con-VEEN-ient!", "The Church Lady", "Saturday Night Live", 1986),
    Shibboleth("Oh, snap!", "Raven Baxter", "That's So Raven", 2003),
    Shibboleth("Danger, Will Robinson", "The Robot", "Lost in Space", 1965),
    Shibboleth("I'm the Map!", "Map", "Dora the Explorer", 2000), Shibboleth("Ke-mo sah-bee", "Tonto", "The Lone Ranger", 1933),
    Shibboleth("Who's Yehoodi?", "Jerry Colonna", "Bob Hope radio program", 1940),
    Shibboleth("The devil made me do it!", "Geraldine Jones", "Rowan & Martin's Laugh-In", 1968),
    Shibboleth("Whatchoo talkin' 'bout Willis?", "Arnold Jackson", "Diff'rent Strokes", 1978),
    Shibboleth("Don't tase me bro!", "Andrew Meyer", "University of Florida", 2007),
    Shibboleth("Take it Sleazy", "Adam DeMamp", "Workaholics", 2012))

  private var count = 0

  def next(): Shibboleth = {
    count += 1
    shibboleths(count % shibboleths.size)
  }
}
