package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println(birdsRemaining);
        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);
        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int playing = 3;
		int dinner = 2;
		int left = playing - dinner;
		System.out.println(left);

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int bees = 3;
		int flowers = 5;
		int dif = flowers - bees;
		System.out.println(dif);

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int firstPigeon = 1;
		int secondPigeon = 1;
		int total = firstPigeon + secondPigeon;
		System.out.println(total);

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int firstOwls = 3;
		int secondOwls = 2;
		int totalOwls = firstOwls + secondOwls;
		System.out.println(totalOwls);

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int homeBeavers = 2;
		int swimBeavers = 1;
		int remainingBeavers = homeBeavers - swimBeavers;
		System.out.println(remainingBeavers);

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int firstToucans = 2;
		int secondToucans = 1;
		int totalToucans = firstToucans + secondToucans;
		System.out.println(totalToucans);

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int squirrelToNutRatio = squirrels - nuts;
		System.out.println(squirrelToNutRatio);
        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarters = 1;
		int dimes = 1;
		int nickels = 2;
		double totalMonies = (.25 * quarters) + (.10 * dimes) + (.05 * nickels);
		System.out.println(totalMonies);

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brier = 18;
		int adams = 20;
		int flan = 17;
		int totalMuffins = brier + adams + flan;
		System.out.println(totalMuffins);


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = .24;
		double whistle = .14;
		double totalCost = yoyo + whistle;
		System.out.println(totalCost);
        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int large = 8;
		int mini = 10;
		int totalMarsh = large + mini;
		System.out.println(totalMarsh);

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hilt = 29;
		int brecknock = 17;
		int diff = hilt - brecknock;
		System.out.println(diff);

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int hiltMoney = 10;
		int truck = 3;
		int pencil = 2;
		double totalLeft = (double) hiltMoney - truck - pencil;
		System.out.println(totalLeft);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbles = 16;
		int lostMarbles = 7;
		int marblesLeft = marbles - lostMarbles;
		System.out.println(marblesLeft);

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seashells = 19;
		int seashellsNeeded = 25 - seashells;
		System.out.println(seashellsNeeded);
        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int red = 8;
		int green = 17 - red;
		System.out.println(green);

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int firstBooks = 38;
		int secondBooks = 10;
		int totalBooks = firstBooks + secondBooks;
		System.out.println(totalBooks);

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int legs = 6;
		int beeses = 8;
		int totalLegs = legs * beeses;
		System.out.println(totalLegs);


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCream = 0.99;
		double totalIceCream = 2;
		double iceCreamCost = iceCream * totalIceCream;
		System.out.println(iceCreamCost);


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNeeded = 125;
		int rocks = 64;
		int rocksDiff = rocksNeeded - rocks;
		System.out.println(rocksDiff);
        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltMarbles = 38;
		int hiltLostMarbles = 15;
		int hiltMarblesLeft = hiltMarbles - hiltLostMarbles;
		System.out.println(hiltMarblesLeft);

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesAway = 78;
		int milesDriven = 32;
		int milesLeft = milesAway - milesDriven;
		System.out.println(milesLeft);


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int hiltShovelHours = 1;
		int hiltShovelMinutes = 30;
		int saturdayMinutes = 45;
		int totalMinutesSpentShoveling = (hiltShovelHours * 60) + hiltShovelMinutes + saturdayMinutes;
		System.out.println(totalMinutesSpentShoveling);
        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hiltDogs = 6;
		double dogCost = 0.50;
		double totalSpentOnDogs = hiltDogs * dogCost;
		System.out.println(totalSpentOnDogs);

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltCents = 50;
		int pencilCost = 7;
		int howMany = pencilCost % hiltCents;
		System.out.println(howMany);



        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int orangeButterflies = 20;
		int redButtterflies = totalButterflies - orangeButterflies;
		System.out.println(redButtterflies);

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double clerk = 1.00;
		double candyCost = .54;
		double changeBack = clerk - candyCost;
		System.out.println(changeBack);


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int firstTrees = 13;
		int secondTrees = 12;
		int totalTrees = firstTrees + secondTrees;
		System.out.println(totalTrees);

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysLeft = 2;
		int hoursLeft = daysLeft * 24;
		System.out.println(hoursLeft);

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
		int peices = 5;
		int gumNeeded = cousins * peices;
		System.out.println(gumNeeded);

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danMoney = 3.00;
		double candyBarCost = 1.00;
		double danLeft = danMoney - candyBarCost;
		System.out.println(danLeft);

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5;
		int boatPeople = 3;
		int totalPeople = boats * boatPeople;
		System.out.println(totalPeople);


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenLegos = 380;
		int legoLost = 57;
		int legoLeft = ellenLegos - legoLost;
		System.out.println(legoLeft);

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int bakedMuffins = 35;
		int muffinsNeeded = 83;
		int muffinsToBake = muffinsNeeded - bakedMuffins;
		System.out.println(muffinsToBake);


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int diffCrayons = willyCrayons - lucyCrayons;
		System.out.println(diffCrayons);


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int pages = 22;
		int totalStickers = stickersPerPage * pages;
		System.out.println(totalStickers);

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double totalCupcakes = 100.0;
		double childrenCount = 8.0;
		double divChildren = totalCupcakes / childrenCount;
		System.out.println(divChildren);

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerCount = 47;
		int jarCook = 6;
		int remainCook = gingerCount % jarCook;
		System.out.println(remainCook);


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
		int neighbors = 8;
		int leftCroissants = croissants % neighbors;
		System.out.println(leftCroissants);


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerTray = 12;
		int totalOatmealCookies = 276;
		int totalTrays = totalOatmealCookies / cookiesPerTray;
		System.out.println(totalTrays);


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int howManyFriendsDoesMarianHave = 480;
		int perServing = 12;
		int thatsHowMany = howManyFriendsDoesMarianHave / perServing;
		System.out.println(thatsHowMany);

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int totalLemon = 53;
		int leftAtHome = 2;
		int lemonLeft = totalLemon - leftAtHome;
		int lemonGiven = lemonLeft / 3;
		System.out.println(lemonGiven);

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrots = 74;
		int people = 12;
		int leftCarrots = carrots % people;
		System.out.println(leftCarrots);



        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddies = 98;
		int tedPerShelf = 7;
		int howManyTeds = teddies / tedPerShelf;
		System.out.println(howManyTeds);


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picsPerAlbum = 20;
		int pictures = 480;
		int totalAlbums = pictures / picsPerAlbum;
		System.out.println(totalAlbums);


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCards = 94;
		int cardsPerBox = 8;
		int fullBoxes = tradingCards / cardsPerBox;
		int unfilledBox = tradingCards % cardsPerBox;
		System.out.println(fullBoxes);
		System.out.println(unfilledBox);

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalBookss = 210;
		int repairedShelves = 10;
		int bookPerShelf = totalBookss / repairedShelves;
		System.out.println(bookPerShelf);


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int chrisCroissants = 17;
		int guests = 7;
		double chrisPer = (double) chrisCroissants / guests;
		System.out.println(chrisPer);

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		int feetPerRoom = 12 * 14;
		double jillSpeed = feetPerRoom / 1.9;
		double billSpeed = feetPerRoom / 2.15;
		double totalTime = (feetPerRoom * 5) / (jillSpeed + billSpeed);
		System.out.println(totalTime);



	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		char middleInitial = 'B';
		String lastName = "Hopper";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";
		System.out.println(fullName);


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		int totalDistance = 800;
		int distanceTraveled = 537;
		double percentage = (double) distanceTraveled / totalDistance;
		int whole = (int) (percentage * 100);
		System.out.println(whole);

	}

}
