/*
 * Copyright 2013 - 2017 Outworkers Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.outworkers.util.samplers

trait BaseSamplers {
  val Names = List(
    "Aleksandar", "Alexander", "Ali", "Amar", "Andrei", "Aron", "Artem", "Artyom", "Ben", "Bence", "Charlie",
    "Davit ", "Dylan", "Emil", "Filip", "Francesco", "Gabriel", "Georgi ", "Georgios", "Giorgi", "Hugo",
    "Jack", "Jakub", "James", "João", "Jon", "Jonas", "Jónas", "Luca", "Lucas", "Luka", "Lukas", "Luke",
    "Maksym", "Malik", "Marc", "Matas", "Mathéo", "Maxim", "Maxim ", "Mehmet", "Milan", "Mohamed", "Nathan",
    "Nikola", "Noah", "Noah ", "Noel", "Oliver", "Onni", "Raphael", "Rasmus", "Roberts", "Robin", "Sem",
    "William", "Yanis", "Yerasyl ", "Yusif", "Yusuf"
  )

  val Surnames = List(
    "Smith", "Jones", "Taylor", "Brown", "Williams", "Wilson", "Johnson", "Davies", "Robinson", "Wright",
    "Thompson", "Evans", "Walker", "White", "Roberts", "Green", "Hall", "Wood", "Jackson", "Clarke"
  )

  val Environments = List("Linux", "Unix", "FreeBSD", "Windows", "Android", "Mac OS X")

  val Cities = List(
    "Berlin", "Madrid", "Rome", "Paris", "Hamburg", "Budapest", "Vienna", "Warsaw", "Bucharest", "Barcelona",
    "Stockholm", "Munich", "Milan", "Prague", "Sofia", "Copenhagen", "Birmingham", "Cologne", "Brussels",
    "Naples", "Turin", "Marseille", "Valencia", "Amsterdam", "Zagreb", "Kraków", "Riga", "Łódź", "Athens",
    "Seville", "Palermo", "Frankfurt", "Wrocław", "Zaragoza", "Helsinki", "Genoa", "Stuttgart", "Glasgow",
    "Düsseldorf", "Berlin", "Madrid", "Rome", "Paris", "Hamburg", "Budapest", "Vienna", "Warsaw", "Bucharest",
    "Barcelona", "Stockholm", "Munich", "Milan", "Prague", "Sofia", "Copenhagen", "Birmingham", "Cologne",
    "Brussels", "Naples", "Turin", "Marseille", "Valencia", "Amsterdam", "Zagreb", "Kraków", "Riga", "Łódź",
    "Athens", "Seville", "Palermo", "Frankfurt", "Wrocław", "Zaragoza", "Helsinki", "Genoa", "Stuttgart",
    "Glasgow", "Düsseldorf"
  )

  val Countries = List(
    "Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belarus", "Belgium", "Bosnia and Herzegovina",
    "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Georgia",
    "Germany", "Greece", "Hungary", "Iceland", "Ireland", "Italy", "Kazakhstan", "Latvia", "Liechtenstein",
    "Lithuania", "Luxembourg", "Macedonia", "Malta", "Moldova", "Monaco", "Montenegro", "Netherlands",
    "Norway", "Poland", "Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia",
    "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom"
  )

  val LoremIpsum = List(
    "ad", "adipisicing", "aliqua", "aliquip", "amet", "anim", "aute", "cillum", "commodo", "consectetur",
    "consequat", "culpa", "cupidatat", "deserunt", "do", "dolor", "dolore", "duis", "ea", "eiusmod", "elit",
    "enim", "esse", "est", "et", "eu", "ex", "excepteur", "exercitation", "fugiat", "id", "in", "incididunt",
    "ipsum", "irure", "labore", "laboris", "laborum", "lorem", "magna", "minim", "mollit", "nisi", "non",
    "nostrud", "nulla", "occaecat", "officia", "pariatur", "proident", "qui", "quis", "reprehenderit", "sed",
    "sint", "sit", "sunt", "tempor", "ullamco", "ut", "velit", "veniam", "voluptate"
  )

  val ProgrammingLanguages = List(
    "C", "Java", "Objective-C", "C++", "Basic", "C#", "Python", "PHP", "Perl", "JavaScript", "Visual Basic",
    "Visual Basic .NET", "Ruby", "F#", "Pascal", "Transact-SQL", "ActionScript", "Delphi/Object Pascal",
    "Lisp", "PL/SQL", "MATLAB", "SAS", "Swift", "Assembly", "ML", "Logo", "PostScript", "D", "COBOL", "R",
    "OpenEdge ABL", "ABAP", "Ada", "Fortran", "Lua", "C shell", "Scratch", "Go", "Scala", "Haskell",
    "Z shell", "cT", "PL/I", "Scheme", "Erlang", "Prolog", "Tcl", "Hack", "Groovy", "LabVIEW")

  val Libraries = List("JQuery", "Kafka")

  val Tools = List("GitHub", "Git", "Ansible", "Mercurial", "SVN", "Fossil")

  val Paradigms = List("MVC", "TTD", "BDD", "Asynchronous Programming", "OOP")

  val Platforms = List("Linux", "Windows", "IOS")

  val Storage = List("Memcache", "MongoDb", "Cassandra")

  val streetNames: Array[String] = Array("Aberdeen", "Abington", "Academy", "Adair", "Adams", "Adamsville", "Aeryview", "Agines", "Airport", "Airwood", "Akron", "Alameda", "Albert", "Albright", "Alburn", "Alexis", "Alfred", "Alice", "Alkire", "Allen", "Allison", "Alvin", "Ambarassdor", "Amber", "Amhurst", "Amsterdam", "Antigua", "Applegate", "Arborwood", "Arcadia", "Arch", "Archer", "Arlington", "Armco", "Armstrong", "Arnold", "Arrowhead", "Arthur", "Ashburton", "Ashley", "Aspen", "Athena", "Athens", "Atlantic", "Auburn", "Austin", "Avalon", "Avon", "Axline", "Ayers", "Babbs", "Back", "Bagley", "Bailey", "Baird", "Baker", "Ball", "Ballard", "Ballov", "Bank", "Bardith", "Barkey", "Barkley", "Barnes", "Barr", "Basil", "Basin", "Bateman", "Baughman", "Beam", "Beard", "Beatty", "Beauty", "Beech", "Beechcreek", "Beechmont", "Beeline", "Belden", "Bell", "Bellflower", "Bellview", "Bellwood", "Belmont", "Benjamin", "Bennett", "Benwood", "Berkley", "Best", "Bethesda", "Beulah", "Beverly", "Bexley", "Billingsley", "Bissett", "Bisson", "Black", "Blackburn", "Blackrun", "Blackstone", "Blackwood", "Blaine", "Blalock", "Blandy", "Blennerhassett", "Blocksom", "Bloomfield", "Blossom", "Blue", "Bluff", "Bobby", "Bodmann", "Boggs", "Bolen", "Bolton", "Bonaparte", "Bonifield", "Bonnair", "Bonsels", "Boston", "Bottom", "Bowman", "Bowser", "Bowtown", "Bradington", "Branch", "Brandywine", "Breezewood", "Brewers", "Briarbush", "Briarcliff", "Briarleigh", "Brick", "Bridge", "Brighton", "Brill", "Bristol", "Britton", "Broad", "Broadvue", "Broadway", "Brookfield", "Brookover", "Brookside", "Brown", "Browns", "Bryan", "Buck", "Buckeye", "Buckingham", "Burbank", "Burlington", "Burnell", "Burnet", "Burns", "Busch", "Butler", "Butter", "Buttermilk", "Byrne", "Caleb", "Calvert", "Cambon", "Cambridge", "Camden", "Camp", "Campbell", "Canal", "Candlestick", "Canewood", "Canfield", "Cannelville", "Canneville", "Cannon", "Carbondale", "Carey", "Carl", "Carlisle", "Carlton", "Carlysle", "Carmen", "Carol", "Carpenter", "Carroll", "Carson", "Carver", "Cass", "Caston", "Castor", "Catalpa", "Cathy", "Catt", "Cattail", "Cattle", "Cecil", "Cedar", "Cedarhurst", "Celina", "Cementary", "Cemetery", "Center", "Central", "Ceramic", "Chalfant", "Chandlersville", "Chapman", "Chardon", "Charlene", "Charles", "Chase", "Chatauqua", "Chatham", "Cheney", "Cherlick", "Cherry", "Chesapeake", "Chester", "Chesterfield", "Chestnut", "Chevington", "Chewelah", "Childrens", "Chillicothe", "China", "Choctaw", "Christopher", "Christy", "Church", "Churchfield", "Circle", "Circleville", "Clairbourne", "Claire", "Clarence", "Clarendon", "Clarice", "Clark", "Clary", "Clay", "Claysville", "Clearcreek", "Clearey", "Clearport", "Clearview", "Cleve", "Cleveland", "Clevenger", "Cliffrock", "Cliffwood", "Clinton", "Clover", "Cloveridge", "Clyde", "Coburg", "Cochran", "Codell", "Cohen", "Colburn", "College", "Collingwood", "Collins", "Colony", "Columbia", "Columbus", "Comin", "Commissioner", "Commonwealth", "Conn", "Convers", "Coopermill", "Cooperriders", "Cooperwell", "Cornell", "Cornstill", "Coronado", "Corvus", "Corwin", "Cosgrave", "Coshocton", "Cottage", "Countiss", "Countryside", "Court", "Cove", "Coventry", "Cowden", "Cranfield", "Crawford", "Creamery", "Creedmoor", "Creekview", "Crestway", "Crock", "Crooks", "Crosier", "Cross", "Crossgate", "Crow", "Crown", "Culbertson", "Curtis", "Dads", "Daisy", "Dale", "Dallman", "Dana", "Daniels", "Danville", "Darcie", "Darla", "Darlington", "Date", "Davis", "Dawnlight", "Dawson", "Dearborn", "December", "Decrow", "Deer", "Deerfield", "Deerpath", "Deewood", "Dellwood", "Delmont", "Delwood", "Denbigh", "Denlinger", "Denmark", "Denning", "Dennis", "Denny", "Depot", "Detroit", "Devin", "Devlin", "Dewey", "Diagonal", "Dickinson", "Dickson", "Dietz", "Dillon", "Discovery", "Dixie", "Dixon", "Dogwood", "Dona", "Donald", "Dooleys", "Dorothy", "Doru", "Douglas", "Dowling", "Downard", "Downing", "Dragoo", "Dresden", "Dryden", "Dundee", "Dunham", "Dunzweiler", "Durban", "Duvall", "Dyer", "East", "Easter", "Eastern", "Eastfield", "Eastlawn", "Eastman", "Eastmoor", "Eastport", "Eastview", "Eastward", "Eastwood", "Eaton", "Echo", "Edalbert", "Eddie", "Eddy", "Ederer", "Edgewater", "Edison", "Edna", "Edward", "Edwards", "Eldwood", "Elfin", "Elida", "Elizabeth", "Ellen", "Eller", "Ellis", "Ellsworth", "Elmville", "Emily", "Englewood", "Enon", "Eppley", "Erie", "Erin", "Essex", "Euclid", "Evans", "Evansport", "Evelyn", "Evergreen", "Ewing", "Exchange", "Extension", "Fair", "Fairall", "Fairbanks", "Faircrest", "Fairmont", "Fairmount", "Fairview", "Fairway", "Fallsburg", "Falt", "Farson", "Fawn", "Faye", "Fayette", "Federal", "Ferncliff", "Fernstone", "Ferrell", "Fess", "Field", "Findley", "First", "Fishers", "Fitzgerald", "Fleek", "Fleming", "Flint", "Flintridge", "Flintwood", "Florence", "Forest", "Forry", "Foster", "Founds", "Fountain", "Fowlers", "Foxfire", "Frame", "Francis", "Franklin", "Frazeysburg", "Freeborn", "Freedom", "Frick", "Friendship", "Frisco", "Fritter", "Front", "Frontier", "Fulbrook", "Fulton", "Fultonrose", "Galbraith", "Galena", "Galigher", "Galighner", "Gallia", "Galway", "Gant", "Gantz", "Garden", "Gardenway", "Garey", "Garfield", "Garner", "Garrell", "Garrett", "Garst", "Gaslight", "Gayla", "Genessee", "George", "Gest", "Gibbard", "Gifford", "Gilbert", "Glade", "Glena", "Glenaven", "Glendale", "Glenhaven", "Glenn", "Glenwillow", "Glenwood", "Glessner", "Goddard", "Gomber", "Goosecreek", "Gordon", "Gorrell", "Gorsuch", "Goslen", "Grace", "Graffis", "Grand", "Grandview", "Granger", "Grant", "Granville", "Gratiot-Newark", "Gray", "Graylock", "Green", "Greenbriar", "Greenbrier", "Greengold", "Greenhouse", "Greenville", "Greenwood", "Greiner", "Grieves", "Grove", "Guava", "Haessler", "Hale", "Hall", "Hamburg", "Hamilton", "Hamline", "Hampton", "Hanawalt", "Hannah", "Hannawalt", "Hanover", "Hanson", "Harbor", "Hardesty", "Harding", "Hardy", "Harkers", "Harlan", "Harmon", "Harmony", "Harper", "Harris", "Harrison", "Harshman", "Hartford", "Hartman", "Hartville", "Hartwell", "Harvey", "Haught", "Hawk", "Hawkes", "Hayes", "Hazel", "Hazlett", "Heath", "Heber", "Hebron", "Heckak", "Heckel", "Hedgewood", "Helene", "Helpar", "Hendershot", "Henry", "Heritage", "Herron", "Hewitt", "Hickam", "Hickman", "Hickory", "Hicks", "Hideaway", "Higgins", "High", "Highland", "Highview", "Hilbish", "Hildreth", "Hill", "Hinman", "Hogans", "Hoge", "Hoiles", "Holbein", "Holbert", "Holliday", "Holmes", "Home", "Homeless", "Homer", "Homes", "Homestead", "Homewood", "Hoover", "Hopewell", "Hospital", "Howard", "Howell", "Hudson", "Huey", "Hughes", "Humphrey", "Hunt", "Hunter", "Hunterdon", "Huntington", "Idaho", "Idlewood", "Ildewood", "Iliamna", "Imlay", "Independence", "Indiana", "Indianola", "Inwood", "Ireland", "Iron", "Island", "Jackson", "James", "Jamestown", "Jannett", "Jefferson", "Jenkins", "Jensen", "Jessamine", "Jewett", "Jewitt", "Jody", "John", "Johnson", "Johnstown", "Jonathan", "Jones", "Jordan", "Joyce", "Juanita", "Julian", "Juniper", "Kahler", "Katherine", "Kauffman", "Kearns", "Keen", "Kegs", "Kelly", "Kennedy", "Kenny", "Kensington", "Kenton", "Kerri", "Kettering", "Kevrob", "Keystone", "Kibler", "Kimes", "King", "Kings", "Kingsley", "Kingswood", "Kinsman", "Kinzel", "Kirk", "Klotz", "Knipe", "Knox", "Kopchak", "Kossuch", "Lacon", "Lafayette", "Lagonda", "Lake", "Lakeside", "Lakewood", "Lambert", "Lancaster", "Lancaster-Chillicoth", "Lander", "Laneway", "Langan", "Lark", "Larkspur", "Larry", "Larzelere", "Lasalle", "Lashley", "Laurel", "Lavona", "Lawhead", "Lawn", "Lawndale", "Lawson", "Lawyers", "Layton", "Lazelere", "Lectric", "Ledbetter", "Leedom", "Leffler", "Lefter", "Legion", "Lenox", "Lent", "Leon", "Leonard", "Leonardville", "Leslie", "Lesslar", "Lewis", "Lexington", "Liberty", "Licking", "Lillian", "Lima", "Limestone", "Lincoln", "Lincolnway", "Lindale", "Lindbergh", "Linden", "Lindsay", "Linn", "Linwood", "Lisa", "Lithopolis", "Livingston", "Lock", "Locksmith", "Locust", "Lodge", "Lomita", "London", "Long", "Lookout", "Lost", "Loudon", "Louise", "Lovers", "Lubring", "Lucas", "Lucasburg", "Luck", "Lundgren", "Lutz", "Macedonia", "Mackenzie", "Madison", "Mailey", "Main", "Malibu", "Manning", "Manor", "Mansfield", "Maple", "Maplecraft", "Mapleview", "Maplewood", "Marchmont", "Marietta", "Marion", "Mark", "Market", "Marketing", "Marlo", "Marne", "Marsha", "Marshdale", "Martin", "Martinel", "Mary", "Mast", "Matthews", "Mayfair", "Maysville", "Mcarthur", "Mccarley", "Mccaslin", "Mcclain", "Mcclure", "Mcconnell", "Mcconnellsville", "Mcdaniel", "Mcdonald", "Mcfarland", "Mcintire", "Mckaig", "Mckeever", "Mckinley", "Mcmillan", "Mcowens", "Mead", "Meadow", "Meadowbrook", "Meadowhaven", "Meadowood", "Mechanicsburg", "Meek", "Melick", "Melrose", "Memory", "Meridian", "Meriwether", "Merlin", "Merriam", "Merrick", "Merrimac", "Merryhill", "Mershon", "Messimer", "Metro", "Miami", "Michael", "Michigan", "Middle", "Middlefork", "Middleton", "Midway", "Milagra", "Military", "Mill", "Miller", "Millers", "Milton", "Miner", "Missouri", "Mitchell", "Moccasin", "Mock", "Mohawk", "Mollysrock", "Mona", "Monroe", "Montague", "Montgomery", "Moonlight", "Moore", "Moorehead", "Moores", "Moorewood", "Morgan", "Morgantown", "Morganville", "Morningstar", "Morrison", "Morse", "Mound", "Moxadarla", "Moxahala", "Muirwood", "Mulberry", "Mundy", "Munson", "Murray", "Muskingum", "Musselman", "Myrtle", "Nancy", "Narrows", "National", "Navy", "Neal", "Neil", "Nelson", "Neptune", "Newark", "Newgate", "Newlon", "Newman", "Newport", "Nichalas", "Nolan", "None", "Nor-Bixbey", "Nora", "Norfield", "Normandy", "Norris", "North", "Northcrest", "Northland", "Norwich", "Norwood", "Nottingham", "Nottinghamshire", "Nugent", "Oakland", "Oakwood", "Obetz", "Odell", "Ohio", "Okey", "Olive", "Olney", "Ontario", "Opera", "Orange", "Orchard", "Orders", "Orton", "Osage", "Osceola", "Otterbein", "Overlook", "Owens", "Oxford", "Paint", "Palamino", "Pallas", "Palmer", "Palmeraway", "Palmwood", "Palomino", "Paragon", "Parish", "Park", "Parker", "Parks", "Parkview", "Parkway", "Parkwood", "Parliament", "Parry", "Partridge", "Patch", "Patricia", "Peachblow", "Pear", "Pearl", "Pembroke", "Penn", "Penney", "Pennisula", "Pennsylvania", "Penrick", "Perdue", "Perine", "Perkins", "Perry", "Perryton", "Pershing", "Peters", "Petersburg", "Peterson", "Pfeifer", "Pfeiffer", "Philadelphia", "Phillips", "Pickwick", "Pierce", "Pike", "Pine", "Pinecrest", "Pinetown", "Pineview", "Pinewood", "Pinkerton", "Pinkley", "Pioneer", "Piper", "Plainfield", "Plantation", "Playford", "Pleasant", "Pleasantview", "Pleasantville", "Pointe", "Poplar", "Portage", "Porter", "Portland", "Potters", "Potts", "Powell", "Prame", "Pratt", "Price", "Princeton", "Prior", "Prison", "Promway", "Prospect", "Pryor", "Public", "Purdy", "Purvis", "Putnam", "Quarry", "Quick", "Quincy", "Quinlan", "Race", "Radnor", "Raiders", "Railroad", "Rains", "Raintree", "Range", "Rankin", "Ransbottom", "Raven", "Ravenwood", "Rawson", "Reading", "Ream", "Redman", "Redondo", "Reed", "Reeves", "Rehl", "Restless", "Reynolds", "Rhonda", "Rice", "Richards", "Richey", "Richman", "Richmond", "Richvale", "Richwood", "Rider", "Ridge", "Ridgefield", "Ridgeland", "Ridgeview", "Ridgewood", "Rigby", "Riggin", "Rigny", "Ritchey", "Ritenour", "River", "Riverside", "Riverview", "Roadayle", "Robertson", "Robin", "Robinson", "Robinwood", "Rock", "Rockville", "Roemer", "Roland", "Rollins", "Rondayle", "Roosevelt", "Roper", "Rose", "Roseville", "Rosewood", "Rowland", "Royalton", "Royma", "Rucker", "Runyan", "Russell", "Rustle", "Ruth", "Ryan", "Salem", "Salgarber", "Sally", "Saltzgaber", "Sampson", "Samuel", "Sand", "Sandhurst", "Sandra", "Sandusky", "Sandvik", "Santoy", "Sarah", "Scarborough", "Scenic", "Schaum", "Schneider", "Scholl", "School", "Schuler", "Schultz", "Schwallie", "Scott", "Scout", "Sealover", "Seaman", "Seborn", "Sells", "Selsam", "Senator", "Seroco", "Sevall", "Severt", "Seward", "Seymore", "Shady", "Shagbark", "Shaliman", "Shandon", "Sharon", "Sharonwood", "Shasta", "Shaw", "Shawnee", "Sheandoah", "Sheila", "Shellhart", "Shenandoah", "Shepherd", "Sherborne", "Sheridan", "Sherman", "Sherwood", "Shindern", "Shinick", "Shinnick", "Shiplett", "Shoop", "Shore", "Short", "Shumaker", "Sibley", "Silliman", "Silmore", "Skyline", "Skyview", "Slack", "Smithfield", "Smithwood", "Snoke", "Snyder", "Sofin", "Solida", "Somers", "Somerset", "Sonora", "Souder", "South", "Southard", "Southeast", "Southern", "Southward", "Spangler", "Sparling", "Spellman", "Spence", "Spencer", "Spielbusch", "Spratt", "Spring", "Springdale", "Spruce", "Spry", "Stacy", "Stalder", "Stalling", "Stanley", "Stansberry", "Stanton", "Stanway", "State", "Steele", "Stein", "Stephens", "Stevens", "Stevy", "Stewart", "Stiers", "Stillmeadow", "Stillwell", "Stine", "Stiver", "Stokely", "Stone", "Stonecreek", "Stormont", "Stout", "Stoutsville", "Strawberry", "Street", "Sturtz", "Stygler", "Sudbury", "Sugargrove", "Sugartree", "Summit", "Sundale", "Sunflower", "Sunkel", "Sunray", "Sunrise", "Sunset", "Superior", "Surger", "Swans", "Swartz", "Swingle", "Sycamore", "Talford", "Talley", "Tamarron", "Tammy", "Tannehill", "Tarkman", "Taylor", "Teakwood", "Tedrick", "Temple", "Terrace", "Terry", "Theobald", "Third", "Thomas", "Thompson", "Thorn", "Thornberry", "Thornhill", "Thurman", "Tiffany", "Tileston", "Titus", "Todd", "Toni", "Towers", "Town", "Trabue", "Traci", "Traco", "Tranquility", "Treehouse", "Tremont", "Trend", "Tridelphia", "Tupedo", "Turner", "Turtle", "Tuscarawas", "Twimenhill", "Tyman", "Underwood", "Uneeda", "Union", "Unknown", "Valley", "Vance", "Vaughn", "Venture", "Venus", "Vernon", "Vetter", "Vicki", "Victory", "Villa", "Village", "Vine", "Vinsel", "Virginia", "Vista", "Vroom", "Wabash", "Wacker", "Wakatomika", "Waldolf", "Walker", "Wall", "Wallwork", "Walnut", "Walter", "Waltham", "Ward", "Wargo", "Warner", "Warners", "Warren", "Warwick", "Washington", "Water", "Waters", "Watkins", "Watson", "Watts", "Wayne", "Weaver", "Webb", "Webster", "Wedgewood", "Weedon", "Weller", "Wells", "Wentz", "Wessex", "West", "Westbourne", "Western", "Westmoor", "Westmore", "Westwood", "Wetsell", "Whaley", "Wheatland", "Wheelabout", "Wheeler", "Wheeling", "Whipple", "Whites", "Whitman", "Wilhelm", "Wilkins", "Williams", "Willis", "Willow", "Wilmer", "Wilmington", "Wilshire", "Wilson", "Winding", "Windmill", "Windsong", "Winfield", "Winlwood", "Winter", "Winton", "Wise", "Wisteria", "Wogan", "Wolfe", "Wolford", "Woodberry", "Woodbrook", "Woodland", "Woodlawn", "Woolper", "Workman", "Wortman", "Wrexham", "Yale", "Yingling", "Yost", "Young", "Zane", "Zanesville", "Zella")
  val addressSuffixes: Array[String] = Array("Avenue", "Boulevard", "Circle", "Crescent", "Court", "Drive", "Heights", "Lane", "Park", "Path", "Parkway", "Place", "Road", "Ridge", "Run", "Square", "Street", "Station", "Terrace", "Trail", "Way", "Rd", "Ln", "St", "Blvd", "Ave", "Drv")
  val cities: Array[String] = Array("Abba", "Abbeville", "Acworth", "Adairsville", "Adel", "Adrian", "Ailey", "Alamo", "Alapaha", "Albany", "Allenhurst", "Alma", "Alma", "Alpharetta", "Alston", "Amboy", "Ambrose", "Americus", "Appling", "Arlington", "Ashburn", "Athens", "Atkinson", "Atlanta", "Attapulgus", "Auburn", "Augusta", "Augusta-Richmond County", "Austell", "Avondale Estates", "Axson", "Baconton", "Baden", "Bainbridge", "Bainbridge", "Baldwin", "Bannockburn", "Barnesville", "Barney", "Barretts", "Barwick", "Baxley", "Bemiss", "Berkeley Lake", "Berlin", "Blackshear", "Blairsville", "Blakely", "Bloomingdale", "Blue Ridge", "Bogart", "Boston", "Bowdon", "Bowens Mill", "Bowman", "Braselton", "Bremen", "Brinson", "Bristol", "Bronwood", "Brookfield", "Brooklet", "Brooks", "Broxton", "Brunswick", "Buchanan", "Buena Vista", "Buford", "Bushnell", "Byromville", "Byron", "Cairo", "Camilla", "Canton", "Carnesville", "Carrollton", "Cartersville", "Cave Spring", "Cecil", "Cedartown", "Centerville", "Chamblee", "Chatsworth", "Chauncey", "Chester", "Chickamauga", "Chula", "Clarkston", "Claxton", "Clayton", "Cleveland", "Clyatteville", "Clyo", "Cobbtown", "Cochran", "Cogdell", "Cohutta", "Colesburg", "College Park", "Collins", "Colquitt", "Columbus", "Commerce", "Conyers", "Coolidge", "Cordele", "Cornelia", "Council", "Country Club Estate", "Coverdale", "Covington", "Cox", "Crawfordville", "Crescent", "Culloden", "Cumming", "Cusseta", "Cuthbert", "Dacula", "Dahlonega", "Daisy", "Dakota", "Dallas", "Dalton", "Damascus", "Danielsville", "Darien", "Dasher", "Dawson", "Dawsonville", "Decatur", "Denmark", "Dillard", "Dixie", "Dock Junction", "Doerun", "Donalsonville", "Doraville", "Douglas", "Douglasville", "Dover Bluff", "Dupont", "Dublin", "Dudley", "Duluth", "Dunwoody", "East Dublin", "East Point", "Eastman", "Eatonton", "Ebenezer", "Edison", "Edith", "Egypt", "Elberton", "Eldorado", "Ellabelle", "Ellaville", "Ellenton", "Ellijay", "Enigma", "Euharlee", "Eulonia", "Everitt", "Fairburn", "Fairmont", "Fargo", "Fayetteville", "Fitzgerald", "Flemington", "Flowery Branch", "Folkston", "Forest Park", "Forsyth", "Fort Gaines", "Fort Oglethorpe", "Fort Stewart", "Fort Valley", "Franklin", "Fruitland", "Funston", "Gainesville", "Garden City", "Garfield", "Geneva", "Georgetown", "Gibson", "Glennville", "Glenwood", "Glory", "Graham", "Gray", "Greensboro", "Greenville", "Griffin", "Grooverville", "Groveland", "Grovetown", "Gumbranch", "Guyton", "Hagan", "Hahira", "Hamilton", "Hampton", "Hapeville", "Harding", "Harding", "Hardwicke", "Harrietts Bluff", "Hartwell", "Hawkinsville", "Haylon", "Hazlehurst", "Helena", "Hepzibah", "Hiawassee", "Hickox", "Higgston", "Hinesville", "Hiram", "Hoboken", "Hogansville", "Holly Springs", "Holt", "Homeland", "Homer", "Homerville", "Hopeulikit", "Hortense", "Howell", "Inaha", "Iron City", "Irwinton", "Irwinville", "Isle Of Hope-Dutch Island", "Jackson", "Janis", "Jasper", "Jefferson", "Jeffersonville", "Jesup", "Johns Creek", "Jonesboro", "Keller", "Kennesaw", "Kinderlou", "Kings Bay Base", "Kingsland", "Kirkland", "Kite", "Lafayette", "Lagrange", "Lake City", "Lake Park", "Lakeland", "Lanier", "Lawrenceville", "Lax", "Leary", "Leefield", "Leesburg", "Lenox", "Lexington", "Lilburn", "Lincolnton", "Lithonia", "Locust Grove", "Loganville", "Lookout Mountain", "Louisville", "Lovejoy", "Ludowici", "Lulaton", "Lumber City", "Lumpkin", "Lyons", "Macon", "Madison", "Manassas", "Manchester", "Marietta", "Maxeys", "Mayday", "Mcdonough", "Mcintosh", "Mcintyre", "Mcrae", "Meigs", "Meldrim", "Mershon", "Metter", "Midway", "Milan", "Milledgeville", "Millen", "Milton", "Moniac", "Monroe", "Montezuma", "Montgomery", "Monticello", "Montrose", "Mora", "Morgan", "Morrow", "Morven", "Moultrie", "Mount Vernon", "Mount Zion", "Mountain Park", "Mystic", "Nahunta", "Nankin", "Nashville", "Needmore", "Nelson", "Nevils", "New Rock Hill", "Newnan", "Newton", "Nicholls", "Norcross", "Norman Park", "Oakwood", "Ochlocknee", "Ocilla", "Odum", "Offerman", "Offerman", "Oglethorpe", "Omega", "Osterfield", "Ousley", "Oxford", "Palmetto", "Parrott", "Patterson", "Peachtree City Website", "Pearson", "Pelham", "Pembroke", "Perry", "Phillipsburg", "Pine Lake", "Pineora", "Pineview", "Pooler", "Port Wentworth", "Portal", "Potter", "Poulan", "Powder Springs", "Preston", "Pridgen", "Pulaski", "Queensland", "Quitman", "Ray City", "Rebecca", "Register", "Reidsville", "Remerton", "Rentz", "Retreat", "Riceboro", "Richmond Hill", "Ridgeville", "Rincon", "Ringgold", "Riverdale", "Riverside", "Rochelle", "Rockingham", "Rockmart", "Rome", "Roswell", "Royston", "Rutledge", "Saint George", "Sale City", "Sandersville", "Sandy Springs", "Sasser", "Savannah", "Screven", "Senoia", "Sessoms", "Shawnee", "Shellman Bluff", "Sirmans", "Skidaway Island", "Smithville", "Smyrna", "Snellville", "Social Circle", "Soperton", "South Newport", "Sparks", "Sparta", "Springfield", "Strongsville", "St. Simons Island", "Statenville", "Statesboro", "Sterling", "Stillmore", "Stillwell", "Stilson", "Stockbridge", "Stockton", "Stone Mountain", "Sugar Hill", "Sumner", "Sunbury", "Sunsweet", "Surrency", "Suwanee", "Swainsboro", "Sycamore", "Sylvania", "Sylvester", "Talbotton", "Tallapoosa", "Tarboro", "Tarver", "Temple", "Thalman", "Thelma", "Thomaston", "Thomasville", "Thomson", "Thunderbolt", "Tifton", "Toccoa", "Toomsboro", "Townsend", "Trenton", "Trudie", "Tucker", "Twin City", "Twin Peaks", "Tybee Island", "Tyrone", "Unadilla", "Union City", "Unionville", "Upton", "Uvalda", "Valdosta", "Valona", "Vernonburg", "Vidalia", "Vienna", "Villa Rica", "Walthourville", "Warrenton", "Warwick", "Washington", "Waterloo", "Watkinsville", "Waverly", "Waycross", "Waynesboro", "Waynesville", "Weber", "West Green", "West Point", "Westwood", "Whigham", "White Oak", "Whitmarsh Island", "Willacoochee", "Wilmington Island", "Winder", "Winokur", "Withers", "Woodbine", "Woodstock", "Worth", "Wray", "Wrightsville")
}


object BaseSamplers extends BaseSamplers