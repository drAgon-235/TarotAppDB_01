package com.example.tarotappdb_01.cards.model

import com.example.tarotappdb_01.R


// The "Rider-Waite" Tarot Deck is the most popular one since over 100 years.
// It is no more protected by any copyrights, which usually expire after 70 years.
// That means, all the attributes & images of each card are worldwide known & the same & free to use for anybody.
// But in order NOT to type the texts from a common book, I copied & combined them from two online Datasets:
// https://www.kaggle.com/datasets/lsind18/tarot-json?resource=download (No API !!!)
// https://tarot-api-3hv5.onrender.com/api/v1/cards (very unprofessional API,
// too slow & too unreliable for usage in my App ( I tested it, only each fifth API-Call was working properly - so I just took the 'description' into my DB, which was missing in the kaggle-DB)


object RawCardData {
/*
    The design of the backside of the card deck is a freepik from:
    <a href="https://www.freepik.com/free-vector/hand-drawn-mystical-tarot-mobile-wallpaper_21862417.htm#page=2&query=tarot%20background&position=9&from_view=keyword&track=ais">Image by pikisuperstar</a> on Freepik
    Thanks a lot :-)
 */

    // Back side
    val card00Backside = Card(
        id = 0,
        name = "Back Side",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "1",
        keywords = "",
        fortuneTelling = "",
        meaning_up = "",
        meaning_rev = "",
        qta = "",
        description = "",
        picture = R.drawable.back_02
    )

    // Major Arcana
    val card01TheFool = Card(
        id = 1,
        name = "The Fool",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "0",
        keywords = "freedom, faith, inexperience, innocence",
        fortuneTelling = "Watch for new projects and new beginnings. \nPrepare to take something on faith. \nSomething new comes your way; go for it!",
        meaning_up = "Freeing yourself from limitation, Expressing joy and youthful vigor, Being open-minded, Taking a leap of faith, Attuning yourself to your instincts, Being eager or curious, Exploring your potential, Embracing innovation and change",
        meaning_rev = "Being gullible and naive, Taking unnecessary risks, Failing to be serious when required, Being silly or distracted, Lacking experience, Failing to honor well-established traditions and limits, Behaving inappropriately",
        qta = "What would I do if I felt free to take a leap? \nHow willing am I to be vulnerable and open? \nHow might past experiences help in this new situation?",
        description = "With light step, as if earth and its trammels had little power to restrain him, a young man in gorgeous vestments pauses at the brink of a precipice among the great heights of the world; he surveys the blue distance before him-its expanse of sky rather than the prospect below. His act of eager walking is still indicated, though he is stationary at the given moment; his dog is still bounding. The edge which opens on the depth has no terror; it is as if angels were waiting to uphold him, if it came about that he leaped from the height. His countenance is full of intelligence and expectant dream. He has a rose in one hand and in the other a costly wand, from which depends over his right shoulder a wallet curiously embroidered. He is a prince of the other world on his travels through this one-all amidst the morning glory, in the keen air. The sun, which shines behind him, knows whence he came, whither he is going, and how he will return by another path after many days. He is the spirit in search of experience. Many symbols of the Instituted Mysteries are summarized in this card, which reverses, under high warrants, all the confusions that have preceded it.\nIn his Manual of Cartomancy, Grand Orient has a curious suggestion of the office of Mystic Fool, as apart of his process in higher divination; but it might call for more than ordinary gifts to put it into operation. We shall see how the card fares according to the common arts of fortune-telling, and it will be an example, to those who can discern, of the fact, otherwise so evident, that the Trumps Major had no place originally in the arts of psychic gambling, when cards are used as the counters and pretexts. Of the circumstances under which this art arose we know, however, very little. The conventional explanations say that the Fool signifies the flesh, the sensitive life, and by a peculiar satire its subsidiary name was at one time the alchemist, as depicting folly at the most insensate stage.",
        picture = R.drawable.m00_fool
    )

    val card02TheMagician = Card(
        id = 2,
        name = "The Magician",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "1",
        keywords = "capability, empowerment, activity",
        fortuneTelling = "A powerful man may play a role in your day. \nYour current situation must be seen as one element of a much larger plan.",
        meaning_up = "Taking appropriate action, Receiving guidance from a higher power, Becoming a channel of divine will, Expressing masculine energy in appropriate and constructive ways, Being yourself in every way",
        meaning_rev = "Inflating your own ego, Abusing talents, Manipulating or deceiving others, Being too aggressive, Using cheap illusions to dazzle others, Refusing to invest the time and effort needed to master your craft, Taking shortcuts",
        qta = "What am I empowered to do? \nHow might my abilities come into play? \nTo what extent am I making the most of my talents?",
        description = "A youthful figure in the robe of a magician, having the countenance of divine Apollo, with smile of confidence and shining eyes. Above his head is the mysterious sign of the Holy Spirit, the sign of life, like an endless cord, forming the figure 8 in a horizontal position . About his waist is a serpent-cincture, the serpent appearing to devour its own tail. This is familiar to most as a conventional symbol of eternity, but here it indicates more especially the eternity of attainment in the spirit. In the Magician's right hand is a wand raised towards heaven, while the left hand is pointing to the earth. This dual sign is known in very high grades of the Instituted Mysteries; it shews the descent of grace, virtue and light, drawn from things above and derived to things below. The suggestion throughout is therefore the possession and communication of the Powers and Gifts of the Spirit. On the table in front of the Magician are the symbols of the four Tarot suits, signifying the elements of natural life, which lie like counters before the adept, and he adapts them as he wills. Beneath are roses and lilies, the flos campi and lilium convallium, changed into garden flowers, to shew the culture of aspiration. This card signifies the divine motive in man, reflecting God, the will in the liberation of its union with that which is above. It is also the unity of individual being on all planes, and in a very high sense it is thought, in the fixation thereof. With further reference to what I have called the sign of life and its connexion with the number 8, it may be remembered that Christian Gnosticism speaks of rebirth in Christ as a change \"unto the Ogdoad.\" The mystic number is termed Jerusalem above, the Land flowing with Milk and Honey, the Holy Spirit and the Land of the Lord. According to Martinism, 8 is the number of Christ.",
        picture = R.drawable.m01_magician
    )

    val card03TheHighPriestess = Card(
        id = 3,
        name = "The High Priestess",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "2",
        keywords = "intuition, reflection, purity, initiation",
        fortuneTelling = "A mysterious woman arrives. \nA sexual secret may surface. \nSomeone knows more than he or she will reveal",
        meaning_up = "Listening to your feelings and intuitions, Exploring unconventional spirituality, Keeping secrets, Being receptive, Reflecting instead of acting, Observing others, Preserving purity",
        meaning_rev = "Being aloof, Obsessing on secrets and conspiracies, Rejecting guidance from spirit or intuition, Revealing all, Ignoring gut feelings, Refusing to become involved, even when involvement is appropriate",
        qta = "What might a rebel against tradition do? \nWhat isn't being said or revealed? \nWhat could be achieved by observing and reflecting?",
        description = "She has the lunar crescent at her feet, a horned diadem on her head, with a globe in the middle place, and a large solar cross on her breast. The scroll in her hands is inscribed with the word Tora, signifying the Greater Law, the Secret Law and the second sense of the Word. It is partly covered by her mantle, to shew that some things are implied and some spoken. She is seated between the white and black pillars--J. and B.--of the mystic Temple, and the veil of the Temple is behind her: it is embroidered with palms and pomegranates. The vestments are flowing and gauzy, and the mantle suggests light--a shimmering radiance. She has been called occult Science on the threshold of the Sanctuary of Isis, but she is really the Secret Church, the House which is of God and man. She represents also the Second Marriage of the Prince who is no longer of this world; she is the spiritual Bride and Mother, the daughter of the stars and the Higher Garden of Eden. She is, in fine, the Queen of the borrowed light, but this is the light of all. She is the Moon nourished by the milk of the Supernal Mother.\\nIn a manner, she is also the Supernal Mother herself--that is to say, she is the bright reflection. It is in this sense of reflection that her truest and highest name in bolism is Shekinah--the co-habiting glory. According to Kabalism, there is a Shekinah both above and below. In the superior world it is called Binah, the Supernal Understanding which reflects to the emanations that are beneath. In the lower world it is MaIkuth--that world being, for this purpose, understood as a blessed Kingdom that with which it is made blessed being the Indwelling Glory. Mystically speaking, the Shekinah is the Spiritual Bride of the just man, and when he reads the Law she gives the Divine meaning. There are some respects in which this card is the highest and holiest of the Greater Arcana.",
        picture = R.drawable.m02_high_priestess
    )

    val card04TheEmpress = Card(
        id = 4,
        name = "The Empress",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "3",
        keywords = "fertility, productivity, ripeness, nurturing",
        fortuneTelling = "Pregnancy is in the cards. \nAn opportunity to be involved in luxurious sexuality is coming. \nBeware a tendency toward addiction.",
        meaning_up = "Nurturing yourself and others, Bearing fruit, Celebrating your body, Bearing (literal or figurative) children, Reveling in luxury, Mothering those around you in positive ways, Enjoying your sexuality, Getting things done",
        meaning_rev = "Overindulging, Being greedy, Smothering someone with attention, Debilitating someone by being overprotective, Inhibiting productivity by obsessing on productivity, Being overcome by addictive behavior",
        qta = "What would a concerned and capable mother do? \nWhat can I do that would emphasize growth? \nHow can I celebrate my own sensuality and sexuality?",
        description = "A stately figure, seated, having rich vestments and royal aspect, as of a daughter of heaven and earth. Her diadem is of twelve stars, gathered in a cluster. The symbol of Venus is on the shield which rests near her. A field of corn is ripening in front of her, and beyond there is a fall of water. The sceptre which she bears is surmounted by the globe of this world. She is the inferior Garden of Eden, the Earthly Paradise, all that is symbolized by the visible house of man. She is not Regina coeli, but she is still refugium peccatorum, the fruitful mother of thousands. There are also certain aspects in which she has been correctly described as desire and the wings thereof, as the woman clothed with the sun, as Gloria Mundi and the veil of the Sanctum Sanctorum; but she is not, I may add, the soul that has attained wings, unless all the symbolism is counted up another and unusual way. She is above all things universal fecundity and the outer sense of the Word. This is obvious, because there is no direct message which has been given to man like that which is borne by woman; but she does not herself carry its interpretation.\\nIn another order of ideas, the card of the Empress signifies the door or gate by which an entrance is obtained into this life, as into the Garden of Venus; and then the way which leads out therefrom, into that which is beyond, is the secret known to the High Priestess: it is communicated by her to the elect. Most old attributions of this card are completely wrong on the symbolism--as, for example, its identification with the Word, Divine Nature, the Triad, and so forth.",
        picture = R.drawable.m03_empress
    )

    val card05TheEmperor = Card(
        id = 5,
        name = "The Emperor",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "4",
        keywords = "authority, regulation, direction, structure",
        fortuneTelling = "A father figure arrives. \nA new employer or authority figure will give you orders. \nExpect discipline or correction in the near future.",
        meaning_up = "Exercising authority, Defining limits, Directing the flow of work, Communicating clear guidelines, Being in control of yourself and others, Tempering aggressive masculinity with wisdom and experience",
        meaning_rev = "Micromanaging, Crushing the creativity of others with a rigid, iron-fisted approach, Insisting on getting your own way, Assuming a dictatorial mindset, Using overt force to achieve your goals and maintain order",
        qta = "How does the issue of control or regulation impact this situation? \nWhat would a compassionate but strict father do? \nWhat needs more control?",
        description = "He has a form of the Crux ansata for his sceptre and a globe in his left hand. He is a crowned monarch--commanding, stately, seated on a throne, the arms of which axe fronted by rams' heads. He is executive and realization, the power of this world, here clothed with the highest of its natural attributes. He is occasionally represented as seated on a cubic stone, which, however, confuses some of the issues. He is the virile power, to which the Empress responds, and in this sense is he who seeks to remove the Veil of Isis; yet she remains virgo intacta.\n" +
                "It should be understood that this card and that of the Empress do not precisely represent the condition of married life, though this state is implied. On the surface, as I have indicated, they stand for mundane royalty, uplifted on the seats of the mighty; but above this there is the suggestion of another presence. They signify also--and the male figure especially--the higher kingship, occupying the intellectual throne. Hereof is the lordship of thought rather than of the animal world. Both personalities, after their own manner, are \"full of strange experience,\" but theirs is not consciously the wisdom which draws from a higher world. The Emperor has been described as (a) will in its embodied form, but this is only one of its applications, and (b) as an expression of virtualities contained in the Absolute Being--but this is fantasy.",
        picture = R.drawable.m04_emperor
    )

    val card06TheHierophant = Card(
        id = 6,
        name = "The Hierophant",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "5",
        keywords = "guidance, knowledge, revelation, belief",
        fortuneTelling = "Expect to be caught in a misdeed and punished accordingly. \nPray for forgiveness and confess wrongdoings. \nA more experienced man, spiritual leader, or father figure will come into your life",
        meaning_up = "Teaching or guiding others, Searching for the truth, Asking for guidance from a higher power, Acknowledging the wisdom and experience of others, Taking vows, Engaging in heartfelt rituals, Volunteering",
        meaning_rev = "Using experience as a means of manipulating or misguiding others, Being dogmatic, Favoring tradition over what is expedient or necessary, Going through the motions of empty rituals, Concealing wisdom, Restricting access to spiritual truths or the gods",
        qta = "What role might tradition or religion play in this situation? \nWho authored the rules? Who enforces them? Why? \nHow might an experienced guide impact this situation?",
        description = "He wears the triple crown and is seated between two pillars, but they are not those of the Temple which is guarded by the High Priestess. In his left hand he holds a sceptre terminating in the triple cross, and with his right hand he gives the well-known ecclesiastical sign which is called that of esotericism, distinguishing between the manifest and concealed part of doctrine. It is noticeable in this connexion that the High Priestess makes no sign. At his feet are the crossed keys, and two priestly ministers in albs kneel before him. He has been usually called the Pope, which is a particular application of the more general office that he symbolizes. He is the ruling power of external religion, as the High Priestess is the prevailing genius of the esoteric, withdrawn power. The proper meanings of this card have suffered woeful admixture from nearly all hands. Grand Orient says truly that the Hierophant is the power of the keys, exoteric orthodox doctrine, and the outer side of the life which leads to the doctrine; but he is certainly not the prince of occult doctrine, as another commentator has suggested.\nHe is rather the summa totius theologiæ, when it has passed into the utmost rigidity of expression; but he symbolizes also all things that are righteous and sacred on the manifest side. As such, he is the channel of grace belonging to the world of institution as distinct from that of Nature, and he is the leader of salvation for the human race at large. He is the order and the head of the recognized hierarchy, which is the reflection of another and greater hierarchic order; but it may so happen that the pontiff forgets the significance of this his symbolic state and acts as if he contained within his proper measures all that his sign signifies or his symbol seeks to shew forth. He is not, as it has been thought, philosophy-except on the theological side; he is not inspiration; and he is not religion, although he is a mode of its expression.",
        picture = R.drawable.m05_hierophant
    )

    val card07TheLovers = Card(
        id = 7,
        name = "The Lovers",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "6",
        keywords = "love, passion, unity, decision",
        fortuneTelling = "A new personal or professional relationship blossoms. \nSexual opportunities abound. \nUnexpectedly, a friend becomes a lover",
        meaning_up = "Showing your love to others, Expressing passion or romantic feelings, Aligning yourself with groups or like-minded others, Bringing people together, Making well-informed decisions",
        meaning_rev = "Debilitating passion, Allowing an unhealthy desire for love to motivate destructive behavior, Disrupting unity, Working against the best interests of those who care about you, Ill-informed decisions",
        qta = "What guides my choices? \nWhat is my heart leading me to do? \nHow might this decision transform me as a person?",
        description = "The sun shines in the zenith, and beneath is a great winged figure with arms extended, pouring down influences. In the foreground are two human figures, male and female, unveiled before each other, as if Adam and Eve when they first occupied the paradise of the earthly body. Behind the man is the Tree of Life, bearing twelve fruits, and the Tree of the Knowledge of Good and Evil is behind the woman; the serpent is twining round it. The figures suggest youth, virginity, innocence and love before it is contaminated by gross material desire. This is in all simplicity the card of human love, here exhibited as part of the way, the truth and the life. It replaces, by recourse to first principles, the old card of marriage, which I have described previously, and the later follies which depicted man between vice and virtue. In a very high sense, the card is a mystery of the Covenant and Sabbath.\nThe suggestion in respect of the woman is that she signifies that attraction towards the sensitive life which carries within it the idea of the Fall of Man, but she is rather the working of a Secret Law of Providence than a willing and conscious temptress. It is through her imputed lapse that man shall arise ultimately, and only by her can he complete himself. The card is therefore in its way another intimation concerning the great mystery of womanhood. The old meanings fall to pieces of necessity with the old pictures, but even as interpretations of the latter, some of them were of the order of commonplace and others were false in symbolism.",
        picture = R.drawable.m06_lovers
    )

    val card08TheChariot = Card(
        id = 8,
        name = "The Chariot",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "7",
        keywords = "advancement, victory, triumph, success",
        fortuneTelling = "Victory is a certainty. \nMove ahead with all plans. \nBeware the jealousy of others.",
        meaning_up = "Breaking through barriers, Moving forward with confidence and authority, Reaching the pinnacle of success, Basking in the glory of achievement, Guiding an effort to total victory, Establishing yourself as a worthy leader",
        meaning_rev = "Resting on laurels, Riding roughshod over the feelings or expectations of others, Focusing more on past successes than future opportunities, Failing to rein in impulsive behavior",
        qta = "To what extent have I arrived? What will my next challenge be? \nHow can I use past achievements to their best advantage? \nWhat would the criteria for real and meaningful success be?",
        description = "An erect and princely figure carrying a drawn sword and corresponding, broadly speaking, to the traditional description which I have given in the first part. On the shoulders of the victorious hero are supposed to be the Urim and Thummim. He has led captivity captive; he is conquest on all planes--in the mind, in science, in progress, in certain trials of initiation. He has thus replied to the sphinx, and it is on this account that I have accepted the variation of Éliphas Lévi; two sphinxes thus draw his chariot. He is above all things triumph in the mind.\nIt is to be understood for this reason (a) that the question of the sphinx is concerned with a Mystery of Nature and not of the world of Grace, to which the charioteer could offer no answer; (b) that the planes of his conquest are manifest or external and not within himself; (c) that the liberation which he effects may leave himself in the bondage of the logical understanding; (d) that the tests of initiation through which he has passed in triumph are to be understood physically or rationally; and (e) that if he came to the pillars of that Temple between which the High Priestess is seated, he could not open the scroll called Tora, nor if she questioned him could he answer. He is not hereditary royalty and he is not priesthood.",
        picture = R.drawable.m07_chariot
    )

    val card09TheStrength = Card(
        id = 9,
        name = "The Strength",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "8",
        keywords = "discipline, boldness, self-discipline, power, vitality",
        fortuneTelling = "Your self-control will be tested. \nA woman will seek to change her partner or lover. \nYou are a strong, capable person.",
        meaning_up = "Imposing restrictions on yourself for your own benefit, Bringing your passions under the control of reason, Resisting impulses that work against your best interests, Taking bold action",
        meaning_rev = "Indulging weakness, even when you know it will damage your health and happiness, Languishing in addiction, Allowing your instincts to tame and conquer you, Failing to take a stand when necessary",
        qta = "To what extent is your life (or work) balanced? \nHow can you achieve greater objectivity? \nWhat course of action would be fair to everyone concerned?",
        description = "A woman, over whose head there broods the same symbol of life which we have seen in the card of the Magician, is closing the jaws of a lion. The only point in which this design differs from the conventional presentations is that her beneficent fortitude has already subdued the lion, which is being led by a chain of flowers. For reasons which satisfy myself, this card has been interchanged with that of justice, which is usually numbered eight. As the variation carries nothing with it which will signify to the reader, there is no cause for explanation. Fortitude, in one of its most exalted aspects, is connected with the Divine Mystery of Union; the virtue, of course, operates in all planes, and hence draws on all in its symbolism. It connects also with innocentia inviolata, and with the strength which resides in contemplation.\nThese higher meanings are, however, matters of inference, and I do not suggest that they are transparent on the surface of the card. They are intimated in a concealed manner by the chain of flowers, which signifies, among many other things, the sweet yoke and the light burden of Divine Law, when it has been taken into the heart of hearts. The card has nothing to do with self-confidence in the ordinary sense, though this has been suggested--but it concerns the confidence of those whose strength is God, who have found their refuge in Him. There is one aspect in which the lion signifies the passions, and she who is called Strength is the higher nature in its liberation. It has walked upon the asp and the basilisk and has trodden down the lion and the dragon.",
        picture = R.drawable.m08_strength
    )

    val card10TheHermit = Card(
        id = 10,
        name = "The Hermit",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "9",
        keywords = "solitude, experience, stillness, withdrawal",
        fortuneTelling = "A period of loneliness begins. \nOne partner in a relationship departs. \nA search for love or money proves fruitless.",
        meaning_up = "Becoming or seeking out a guru, Going on a retreat, Recharging spiritual or creative batteries, Lighting the way for those with less experience, Stepping back to gain perspective",
        meaning_rev = "Being a loner, Fearing contact with others, Becoming a know-it-all, Inflating claims of expertise, Hiding your skills and talents out of fear of unworthiness",
        qta = "What would happen if I simply withdrew and took no action? \nHow can I get some perspective on the situation? \nWho has walked this path before me? How can I enlist his or her help?",
        description = "The variation from the conventional models in this card is only that the lamp is not enveloped partially in the mantle of its bearer, who blends the idea of the Ancient of Days with the Light of the World It is a star which shines in the lantern. I have said that this is a card of attainment, and to extend this conception the figure is seen holding up his beacon on an eminence. Therefore the Hermit is not, as Court de Gebelin explained, a wise man in search of truth and justice; nor is he, as a later explanation proposes, an especial example of experience. His beacon intimates that \"where I am, you also may be.\"\nIt is further a card which is understood quite incorrectly when it is connected with the idea of occult isolation, as the protection of personal magnetism against admixture. This is one of the frivolous renderings which we owe to Éliphas Lévi. It has been adopted by the French Order of Martinism and some of us have heard a great deal of the Silent and Unknown Philosophy enveloped by his mantle from the knowledge of the profane. In true Martinism, the significance of the term Philosophe inconnu was of another order. It did not refer to the intended concealment of the Instituted Mysteries, much less of their substitutes, but--like the card itself--to the truth that the Divine Mysteries secure their own protection from those who are unprepared.",
        picture = R.drawable.m09_hermit
    )

    val card11WheelOfFortune = Card(
        id = 11,
        name = "Wheel Of Fortune",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "10",
        keywords = "luck, randomness, cycles, karma, fate, revolution",
        fortuneTelling = "Some events are in the hands of heaven. \nYou've lived through this before. \nWhat happened then?",
        meaning_up = "Allowing events to unfold, Seeing the larger pattern in everyday events, Trusting your luck, Watching for cycles, Believing that \"what goes around, comes around\"",
        meaning_rev = "Losing money gambling, Refusing to do your part to bring a plan to fruition, Taking a fatalistic approach to life, Fighting the natural course of events",
        qta = "How does this challenge fit into a larger pattern? \nWhat role does luck play in my circumstances? \nWhat can I control? How should I know when to relinquish control?",
        description = "In this symbol I have again followed the reconstruction of Éliphas Lévi, who has furnished several variants. It is legitimate--as I have intimated--to use Egyptian symbolism when this serves our purpose, provided that no theory of origin is implied therein. I have, however, presented Typhon in his serpent form. The symbolism is, of course, not exclusively Egyptian, as the four Living Creatures of Ezekiel occupy the angles of the card, and the wheel itself follows other indications of Lévi in respect of Ezekiel's vision, as illustrative of the particular Tarot Key. With the French occultist, and in the design itself, the symbolic picture stands for the perpetual motion of a fluidic universe and for the flux of human life. The Sphinx is the equilibrium therein. The transliteration of Taro as Rota is inscribed on the wheel, counterchanged with the letters of the Divine Name--to shew that Providence is imphed through all. But this is the Divine intention within, and the similar intention without is exemplified by the four Living Creatures. Sometimes the sphinx is represented couchant on a pedestal above, which defrauds the symbolism by stultifying the essential idea of stability amidst movement.\nBehind the general notion expressed in the symbol there lies the denial of chance and the fatality which is implied therein. It may be added that, from the days of Lévi onward, the occult explanations of this card are--even for occultism itself--of a singularly fatuous kind. It has been said to mean principle, fecundity, virile honour, ruling authority, etc. The findings of common fortune-telling are better than this on their own plane.",
        picture = R.drawable.m10_wheel_fortune
    )

    val card12Justice = Card(
        id = 12,
        name = "Justice",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "11",
        keywords = "balance, law, fairness, objectivity",
        fortuneTelling = "A legal verdict will be rendered soon. \nSomeone is making a decision. \nYou need to get the facts.",
        meaning_up = "Making an objective decision, Weighing an issue carefully before taking action, Appropriately scaling your reaction to a situation, Getting all the facts, Considering evidence, Deliberating",
        meaning_rev = "Delivering harsh criticism, Obsessing on rules and regulations, Playing by the book even when it is destructive or counterproductive to do so, Confusing snap decisions with timely action, Playing favorites",
        qta = "How can I enhance my self-discipline? \nWhat behaviors tempt me? How can I resist? \nWhat instincts do I continue to struggle with today?",
        description = "As this card follows the traditional symbolism and carries above all its obvious meanings, there is little to say regarding it outside the few considerations collected in the first part, to which the reader is referred.\nIt will be seen, however, that the figure is seated between pillars, like the High Priestess, and on this account it seems desirable to indicate that the moral principle which deals unto every man according to his works--while, of course, it is in strict analogy with higher things;--differs in its essence from the spiritual justice which is involved in the idea of election. The latter belongs to a mysterious order of Providence, in virtue of which it is possible for certain men to conceive the idea of dedication to the highest things. The operation of this is like the breathing of the Spirit where it wills, and we have no canon of criticism or ground of explanation concerning it. It is analogous to the possession of the fairy gifts and the high gifts and the gracious gifts of the poet: we have them or have not, and their presence is as much a mystery as their absence. The law of Justice is not however involved by either alternative. In conclusion, the pillars of Justice open into one world and the pillars of the High Priestess into another.",
        picture = R.drawable.m11_justice
    )

    val card13TheHangedMan = Card(
        id = 13,
        name = "The Hanged Man",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "12",
        keywords = "enlightenment, sacrifice, perspective, suspension, reversals",
        fortuneTelling = "A traitor is revealed. \nOne of your friends is working against you. \nChange your ways or suffer the consequences.",
        meaning_up = "Seeing growth opportunities in unpleasant events, Experiencing a dramatic change in personal perspective, Making the best of an unforeseen change in your life or work, Suspending disbelief, Making sacrifices",
        meaning_rev = "Being untrue to yourself and your values, Refusing to make sacrifices when appropriate, Refusing to adapt to new situations, Blaming others, Profiting at the expense of others",
        qta = "How can I radically alter my perspective? \nHow might being stuck actually be a blessing in disguise? \nHow can I help myself see the glass as half full?",
        description = "The gallows from which he is suspended forms a Tau cross, while the figure--from the position of the legs--forms a fylfot cross. There is a nimbus about the head of the seeming martyr. It should be noted (1) that the tree of sacrifice is living wood, with leaves thereon; (2) that the face expresses deep entrancement, not suffering; (3) that the figure, as a whole, suggests life in suspension, but life and not death. It is a card of profound significance, but all the significance is veiled. One of his editors suggests that Éliphas Lévi did not know the meaning, which is unquestionable nor did the editor himself. It has been called falsely a card of martyrdom, a card a of prudence, a card of the Great Work, a card of duty; but we may exhaust all published interpretations and find only vanity. I will say very simply on my own part that it expresses the relation, in one of its aspects, between the Divine and the Universe.\nHe who can understand that the story of his higher nature is imbedded in this symbolism will receive intimations concerning a great awakening that is possible, and will know that after the sacred Mystery of Death there is a glorious Mystery of Resurrection.",
        picture = R.drawable.m12_hangman
    )

    val card14Death = Card(
        id = 14,
        name = "Death",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "13",
        keywords = "ending, conclusion, transition, passage, departure",
        fortuneTelling = "A relationship or illness ends suddenly. \nLimit travel and risk-taking. \nGeneral gloom and doom.",
        meaning_up = "Bringing an unpleasant phase of life to an end, Recognizing and celebrating the conclusion of something, Putting bad habits to rest, Becoming a new person, Leaving one person, place, or thing for another, Letting go",
        meaning_rev = "Obsessing on death and dying, Refusing to give up old habits or unhealthy relationships, Insisting that everything and everyone should stay the same forever, Failing to take good care of yourself",
        qta = "What needs to end? \nHow might an ending actually be a blessing in this situation? \nWhat's next?",
        description = "The veil or mask of life is perpetuated in change, transformation and passage from lower to higher, and this is more fitly represented in the rectified Tarot by one of the apocalyptic visions than by the crude notion of the reaping skeleton. Behind it lies the whole world of ascent in the spirit. The mysterious horseman moves slowly, bearing a black banner emblazoned with the Mystic Rose, which signifies life. Between two pillars on the verge of the horizon there shines the sun of immortality. The horseman carries no visible weapon, but king and child and maiden fall before him, while a prelate with clasped hands awaits his end.\nThere should be no need to point out that the suggestion of death which I have made in connection with the previous card is, of course, to be understood mystically, but this is not the case in the present instance. The natural transit of man to the next stage of his being either is or may be one form of his progress, but the exotic and almost unknown entrance, while still in this life, into the state of mystical death is a change in the form of consciousness and the passage into a state to which ordinary death is neither the path nor gate. The existing occult explanations of the 13th card are, on the whole, better than usual, rebirth, creation, destination, renewal, and the rest.",
        picture = R.drawable.m13_death
    )

    val card15Temperance = Card(
        id = 15,
        name = "Temperance",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "14",
        keywords = "blending, synthesis, mediation, combination, harmony",
        fortuneTelling = "Someone's using drugs or alcohol to excess. \nIt's time to get back on that diet.",
        meaning_up = "Bringing opposites together, Moderating your actions or emotions, Finding middle ground, Reaching compromises, Synthesizing solutions that please everyone involved, Using the old to make something new",
        meaning_rev = "Going to extremes, Disrupting group efforts, Ignoring healthy approaches to life, Becoming an addict, Practicing gluttony, Tearing something or someone apart, Breaking alliances",
        qta = "How can I avoid extremes? \nWhat does everyone involved have in common? \nHow might combining familiar things help me create something new?",
        description = "A winged angel, with the sign of the sun upon his forehead and on his breast the square and triangle of the septenary. I speak of him in the masculine sense, but the figure is neither male nor female. It is held to be pouring the essences of life from chalice to chalice. It has one foot upon the earth and one upon waters, thus illustrating the nature of the essences. A direct path goes up to certain heights on the verge of the horizon, and above there is a great light, through which a crown is seen vaguely. Hereof is some part of the Secret of Eternal Life, as it is possible to man in his incarnation. All the conventional emblems are renounced herein.\nSo also are the conventional meanings, which refer to changes in the seasons, perpetual movement of life and even the combination of ideas. It is, moreover, untrue to say that the figure symbolizes the genius of the sun, though it is the analogy of solar light, realized in the third part of our human triplicity. It is called Temperance fantastically, because, when the rule of it obtains in our consciousness, it tempers, combines and harmonises the psychic and material natures. Under that rule we know in our rational part something of whence we came and whither we are going.",
        picture = R.drawable.m14_temperance
    )

    val card16TheDevil = Card(
        id = 16,
        name = "The Devil",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "15",
        keywords = "shadow, materialism, bondage, delusion",
        fortuneTelling = "Adultery and unfaithfulness. \nA string of extremely bad luck is coming your way. \nBeware evil influences and wolves in sheep's clothing.",
        meaning_up = "Appreciating the luxuries that life has to offer, Being comfortable in your own skin, Enjoying your sexuality, Splurging on an expensive personal item, Embracing the fact that everyone has a darker side, Dealing with unhealthy impulses in healthy ways",
        meaning_rev = "Putting excessive emphasis on appearances, Always wanting more, Valuing possessions more than people or relationships, Allowing base instincts to govern your life, Being selfish, Attributing your own dark impulses to outside forces or other people",
        qta = "What enslaves me? How can I set myself free? \nHow can I re-evaluate the importance I assign to material things? \nTo what extent do my cravings define me?",
        description = "The design is an accommodation, mean or harmony, between several motives mentioned in the first part. The Horned Goat of Mendes, with wings like those of a bat, is standing on an altar. At the pit of the stomach there is the sign of Mercury. The right hand is upraised and extended, being the reverse of that benediction which is given by the Hierophant in the fifth card. In the left hand there is a great flaming torch, inverted towards the earth. A reversed pentagram is on the forehead. There is a ring in front of the altar, from which two chains are carried to the necks of two figures, male and female. These are analogous with those of the fifth card, as if Adam and Eve after the Fall. Hereof is the chain and fatality of the material life.\nThe figures are tailed, to signify the animal nature, but there is human intelligence in the faces, and he who is exalted above them is not to be their master for ever. Even now, he is also a bondsman, sustained by the evil that is in him and blind to the liberty of service. With more than his usual derision for the arts which he pretended to respect and interpret as a master therein, Éliphas Lévi affirms that the Baphometic figure is occult science and magic. Another commentator says that in the Divine world it signifies predestination, but there is no correspondence in that world with the things which below are of the brute. What it does signify is the Dweller on the Threshold without the Mystical Garden when those are driven forth therefrom who have eaten the forbidden fruit.",
        picture = R.drawable.m15_devil
    )

    val card17TheTower = Card(
        id = 17,
        name = "The Tower",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "16",
        keywords = "demolition, upheaval, deconstruction, disaster, destruction",
        fortuneTelling = "Impending disaster. \nCancel plans and reverse decisions. \nSomeone wants to take you down a notch or two. \nDon't hold back; say what you really mean.",
        meaning_up = "Breaking out of old, confining habits and mindsets, Clearing the way for new growth, Dispelling the influence of an inflated ego, Getting back to basics, Stripping away harmful illusions, Receiving sudden insight",
        meaning_rev = "Clinging to traditions that repress growth, Engaging in willful blindness, Rejecting evidence that change is needed, Ignoring guidance from a higher power, Maliciously engaging in destructive behavior",
        qta = "How might the current situation dramatically alter my perspective? \nHow might this loss open the door for new growth? \nWhat attitudes need to be struck down before I proceed?",
        description = "Occult explanations attached to this card are meagre and mostly disconcerting. It is idle to indicate that it depicts min in all its aspects, because it bears this evidence on the surface. It is said further that it contains the first allusion to a material building, but I do not conceive that the Tower is more or less material than the pillars which we have met with in three previous cases. I see nothing to warrant Papus in supposing that it is literally the fall of Adam, but there is more in favour of his alternative--that it signifies the materialization of the spiritual word. The bibliographer Christian imagines that it is the downfall of the mind, seeking to penetrate the mystery of God. I agree rather with Grand Orient that it is the ruin of the House of We, when evil has prevailed therein, and above all that it is the rending of a House of Doctrine. I understand that the reference is, however, to a House of Falsehood. It illustrates also in the most comprehensive way the old truth that \"except the Lord build the house, they labour in vain that build it.\"\nThere is a sense in which the catastrophe is a reflection from the previous card, but not on the side of the symbolism which I have tried to indicate therein. It is more correctly a question of analogy; one is concerned with the fall into the material and animal state, while the other signifies destruction on the intellectual side. The Tower has been spoken of as the chastisement of pride and the intellect overwhelmed in the attempt to penetrate the Mystery of God; but in neither case do these explanations account for the two persons who are the living sufferers. The one is the literal word made void and the other its false interpretation. In yet a deeper sense, it may signify also the end of a dispensation, but there is no possibility here for the consideration of this involved question.",
        picture = R.drawable.m16_tower
    )

    val card18TheStar = Card(
        id = 18,
        name = "TheStar",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "17",
        keywords = "hope, optimism, openness, certainty, faith, longing, truth",
        fortuneTelling = "Get an astrology chart drawn up. \nSomeone is a little too starstruck. \nWhat's happening now has long been fore-ordained.",
        meaning_up = "Hoping for the best, Believing good things happen to good people, Seeing events in the best possible light, Adopting a generous spirit, Seeking guidance from above, Embracing possibility over probability",
        meaning_rev = "Denying unpleasant truths, Denying personal accountability and saying, \"Things just happen!\", Ignoring signs and omens, Preferring illusion to reality, Spreading pessimism and stinginess of spirit",
        qta = "What would my higher power direct me to do? \nHow can I be less self-conscious and guarded? \nHow can I better attune myself to the abundance of life's blessings?",
        description = "A great, radiant star of eight rays, surrounded by seven lesser stars--also of eight rays. The female figure in the foreground is entirely naked. Her left knee is on the land and her right foot upon the water. She pours Water of Life from two great ewers, irrigating sea and land. Behind her is rising ground and on the right a shrub or tree, whereon a bird alights. The figure expresses eternal youth and beauty. The star is l'étoile flamboyante, which appears in Masonic symbolism, but has been confused therein. That which the figure communicates to the living scene is the substance of the heavens and the elements. It has been said truly that the mottoes of this card are \"Waters of Life freely\" and \"Gifts of the Spirit.\"\nThe summary of several tawdry explanations says that it is a card of hope. On other planes it has been certified as immortality and interior light. For the majority of prepared minds, the figure will appear as the type of Truth unveiled, glorious in undying beauty, pouring on the waters of the soul some part and measure of her priceless possession. But she is in reality the Great Mother in the Kabalistic Sephira Binah, which is supernal Understanding, who communicates to the Sephiroth that are below in the measure that they can receive her influx.",
        picture = R.drawable.m17_star
    )

    val card19TheMoon = Card(
        id = 19,
        name = "The Moon",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "18",
        keywords = "mystery, fantasy, imagination, dreams, uncertainty",
        fortuneTelling = "Watch for problems at the end of the month. \nSomeone you know needs to howl at the moon more often. \nSomeone is about to change his or her mind about an important decision.",
        meaning_up = "Enjoying healthy fantasies and daydreams, Using your imagination, Practicing magic or celebrating the magic of everyday life, Attuning yourself to the cycles of nature, Embracing the unknown",
        meaning_rev = "Becoming unable to separate fantasy from reality, Suffering from delusions, Losing your appreciation for the fantastic or magical, Adopting a ruthlessly logical mindset, Failing to appreciate life's mysteries",
        qta = "How can I face my fears and move forward? \nWhat helpers can serve me as guides through my personal darkness? \nHow can I deal with the unknown in healthy ways?",
        description = "The distinction between this card and some of the conventional types is that the moon is increasing on what is called the side of mercy, to the right of the observer. It has sixteen chief and sixteen secondary rays. The card represents life of the imagination apart from life of the spirit. The path between the towers is the issue into the unknown. The dog and wolf are the fears of the natural mind in the presence of that place of exit, when there is only reflected light to guide it.\nThe last reference is a key to another form of symbolism. The intellectual light is a reflection and beyond it is the unknown mystery which it cannot shew forth. It illuminates our animal nature, types of which are represented below--the dog, the wolf and that which comes up out of the deeps, the nameless and hideous tendency which is lower than the savage beast. It strives to attain manifestation, symbolized by crawling from the abyss of water to the land, but as a rule it sinks back whence it came. The face of the mind directs a calm gaze upon the unrest below; the dew of thought falls; the message is: Peace, be still; and it may be that there shall come a calm upon the animal nature, while the abyss beneath shall cease from giving up a form.",
        picture = R.drawable.m18_moon
    )

    val card20TheSun = Card(
        id = 20,
        name = "The Sun",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "19",
        keywords = "joy, brilliance, validation, attention, energy",
        fortuneTelling = "Everything's coming up roses (or sunflowers, whatever the case may be). \nWhatever's on your mind, go for it because you can't lose today!",
        meaning_up = "Seeing things clearly, Experiencing intense joy, Celebrating your own successes, Knowing you're good at what you do, Gaining recognition for your personal genius",
        meaning_rev = "Being dazzled by your own accomplishments, Becoming absorbed in your own self-image, Feeling rushed and distracted, Exerting yourself to the point of exhaustion, Overstating your abilities or misrepresenting your achievements",
        qta = "How can I take best advantage of the attention coming my way? \nWhat are my highest spiritual goals? \nHow can I avoid being bedazzled by the energy swirling around me?",
        description = "The naked child mounted on a white horse and displaying a red standard has been mentioned already as the better symbolism connected with this card. It is the destiny of the Supernatural East and the great and holy light which goes before the endless procession of humanity, coming out from the walled garden of the sensitive life and passing on the journey home. The card signifies, therefore, the transit from the manifest light of this world, represented by the glorious sun of earth, to the light of the world to come, which goes before aspiration and is typified by the heart of a child.\nBut the last allusion is again the key to a different form or aspect of the symbolism. The sun is that of consciousness in the spirit - the direct as the antithesis of the reflected light. The characteristic type of humanity has become a little child therein--a child in the sense of simplicity and innocence in the sense of wisdom. In that simplicity, he bears the seal of Nature and of Art; in that innocence, he signifies the restored world. When the self-knowing spirit has dawned in the consciousness above the natural mind, that mind in its renewal leads forth the animal nature in a state of perfect conformity.",
        picture = R.drawable.m19_sun
    )

    val card21Judgement = Card(
        id = 21,
        name = "The Last Judgement",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "20",
        keywords = "revival, renewal, resurrection, evaluation, invitation",
        fortuneTelling = "An old issue you thought was over will come up again today. \nGet ready for huge changes: break-ups, sudden calls from old friends, and unexpected setbacks. \nGod's trying to get your attention.",
        meaning_up = "Receiving a wake-up call, Discovering a new purpose in life, Becoming totally and completely yourself, Receiving a well-deserved reward, Passing an evaluation or examination, Welcoming the start of a new phase of life",
        meaning_rev = "Being weighed in the balances and found wanting, Failing to measure up to a well-defined standard, Being caught goofing off or misbehaving, Failing to prepare for an examination you know is coming, Rejecting an opportunity to reinvent yourself",
        qta = "What is the main thing I need to realize about myself? \nIn what way might the universe be trying to get my attention? \nIf I were to reinvent myself, what would I become?",
        description = "I have said that this symbol is essentially invariable in all Tarot sets, or at least the variations do not alter its character. The great angel is here encompassed by clouds, but he blows his bannered trumpet, and the cross as usual is displayed on the banner. The dead are rising from their tombs--a woman on the right, a man on the left hand, and between them their child, whose back is turned. But in this card there are more than three who are restored, and it has been thought worth while to make this variation as illustrating the insufficiency of current explanations. It should be noted that all the figures are as one in the wonder, adoration and ecstacy expressed by their attitudes. It is the card which registers the accomplishment of the great work of transformation in answer to the summons of the Supernal--which summons is heard and answered from within.\nHerein is the intimation of a significance which cannot well be carried further in the present place. What is that within us which does sound a trumpet and all that is lower in our nature rises in response--almost in a moment, almost in the twinkling of an eye? Let the card continue to depict, for those who can see no further, the Last judgment and the resurrection in the natural body; but let those who have inward eyes look and discover therewith. They will understand that it has been called truly in the past a card of eternal life, and for this reason it may be compared with that which passes under the name of Temperance.",
        picture = R.drawable.m20_judgement
    )

    val card22TheWorld = Card(
        id = 22,
        name = "The World",
        suit = SuitEnum.MAJOR_ARCANA,
        value = "21",
        keywords = "wholeness, integration, totality, completeness, fullness",
        fortuneTelling = "Winning the lottery. \nGetting your heart's desire. \nHaving everything you ever imagined having.",
        meaning_up = "Having it all, Knowing and loving yourself as completely as possible, Seeing the interconnection of all things and people, Enhancing your perspective, Living life to its fullest, Understanding the meaning of life",
        meaning_rev = "Allowing greed and envy to prevent you from enjoying what you do possess, Failing to see the larger design in ordinary events, Believing that everything that exists can be touched, counted, or measured, Failing to see the divine reflected in those around you",
        qta = "For me, what would having it all mean? \nHow aware am I of my own connectedness to the world around me? \nWhat keeps me from having it all right now, today?",
        description = "As this final message of the Major Trumps is unchanged--and indeed unchangeable--in respect of its design, it has been partly described already regarding its deeper sense. It represents also the perfection and end of the Cosmos, the secret which is within it, the rapture of the universe when it understands itself in God. It is further the state of the soul in the consciousness of Divine Vision, reflected from the self-knowing spirit. But these meanings are without prejudice to that which I have said concerning it on the material side.\nIt has more than one message on the macrocosmic side and is, for example, the state of the restored world when the law of manifestation shall have been carried to the highest degree of natural perfection. But it is perhaps more especially a story of the past, referring to that day when all was declared to be good, when the morning stars sang together and all the Sons of God shouted for joy. One of the worst explanations concerning it is that the figure symbolizes the Magus when he has reached the highest degree of initiation; another account says that it represents the absolute, which is ridiculous. The figure has been said to stand for Truth, which is, however, more properly allocated to the seventeenth card. Lastly, it has been called the Crown of the Magi.",
        picture = R.drawable.m21_world
    )


    // The Cups
    val card23Cups01 = Card(
        id = 23,
        name = "Ace of Cups",
        suit = SuitEnum.CUPS,
        value = "1",
        keywords = "intuition, spirituality, affection, motivation",
        fortuneTelling = "Romance is in the cards. \nA new relationship or marriage is just around the corner. \nPrayers are answered.",
        meaning_up = "Trusting your feelings, Opening yourself to spirit, Accepting and returning affection, Getting in touch with what motivates you, Taking advantage of an opportunity to express love to others, Listening to the still, small voice",
        meaning_rev = "Hiding your feelings, Spurning an opportunity to love or be loved, Numbing yourself to spiritual yearnings, Rejecting the counsel of your heart, Becoming a puppet of your own emotions, Indulging in hysteria or obsession",
        qta = "What am I feeling right now? \nHow would I go about opening myself to spiritual guidance? \nWhat motivates me the most - pleasure or pain? Why?",
        description = "The waters are beneath, and thereon are water-lilies; the hand issues from the cloud, holding in its palm the cup, from which four streams are pouring; a dove, bearing in its bill a cross-marked Host, descends to place the Wafer in the Cup; the dew of water is falling on all sides. It is an intimation of that which may lie behind the Lesser Arcana.",
        picture = R.drawable.c01
    )

    val card24Cups02 = Card(
        id = 24,
        name = "Two Cups",
        suit = SuitEnum.CUPS,
        value = "2",
        keywords = "union, attraction, combination, affection",
        fortuneTelling = "Someone has a secret crush on you. \nRelationships should be mutual; get rid of a leech.",
        meaning_up = "Being drawn to someone, Longing for someone or something, Acting on your desires, Discovering a feeling is mutual, Doing what makes you feel good, Merging, Healing broken ties, Admitting two people feel differently about each other and moving on",
        meaning_rev = "Burning bridges, Becoming caught up in unhealthy codependency, Shutting out anyone but your chosen few, Obsessing on someone who does not return your affections, Despairing over finding \"The One\", Deceiving yourself about your true orientation",
        qta = "How can I make sure that what I'm feeling is mutual? \nWhen was the last time I felt \"in love\" with someone or something? \nWhat do you need in order to feel emotionally stable?",
        description = "A youth and maiden are pledging one another, and above their cups rises the Caduceus of Hermes, between the great wings of which there appears a lion's head. It is a variant of a sign which is found in a few old examples of this card. Some curious emblematical meanings are attached to it, but they do not concern us in this place.",
        picture = R.drawable.c02
    )

    val card25Cups03 = Card(
        id = 25,
        name = "Three Cups",
        suit = SuitEnum.CUPS,
        value = "3",
        keywords = "celebration, expression, community, friendliness",
        fortuneTelling = "Unconventional romance is coming your way: a love affair with someone you've always dismissed",
        meaning_up = "Celebrating your feelings or connections with others, Expressing joy through song, dance, or physical affection, Working together with others who share your feelings, Performing acts of service as a way of saying, \"I love you\", Embracing unconventional romantic arrangements",
        meaning_rev = "Mistaking giddiness for true affection, Being dominated by manic emotions, Expecting everyone to always feel the same way you do, Demanding unreasonable support from friends or family, Partying to a dangerous or unhealthy extent",
        qta = "What's worth celebrating in my life? \nHow can I demonstrate my feelings in appropriate ways? \nWhat can I do to show my partner how I really feel?",
        description = "Maidens in a garden-ground with cups uplifted, as if pledging one another.",
        picture = R.drawable.c03
    )

    val card26Cups04 = Card(
        id = 26,
        name = "Four Cups",
        suit = SuitEnum.CUPS,
        value = "4",
        keywords = "boredom, listlessness, lethargy, stability, ingratitude",
        fortuneTelling = "A lover is getting restless. \nFind out what he or she needs, or new opportunities may lure your partner away.",
        meaning_up = "Maintaining your emotional stability, Refusing to give in to overwhelming emotions, Appreciating what you have and refusing to take it for granted, Seeing the value of long-term commitments",
        meaning_rev = "Being bored, Daydreaming at the expense of your work, Refusing to be engaged by opportunity, Taking people and relationships for granted, Ignoring romantic or spiritual opportunities, Spurning inspiration, Feeling everything should stay \"just like it is\"",
        qta = "How can I use this \"downtime\" to my best advantage? \nHow can I show my partner that I don't take him or her for granted? \nTo what extent is my mood blinding me to new opportunities?",
        description = "A young man is seated under a tree and contemplates three cups set on the grass before him; an arm issuing from a cloud offers him another cup. His expression notwithstanding is one of discontent with his environment.",
        picture = R.drawable.c04
    )

    val card27Cups05 = Card(
        id = 27,
        name = "Five Cups",
        suit = SuitEnum.CUPS,
        value = "5",
        keywords = "loss, despair, re-evaluation, regret, uncertainty, repentance",
        fortuneTelling = "A breakup looms. \nDon't cry over spilt milk. \nTake your lumps and get back in the saddle.",
        meaning_up = "Acknowledging loss and moving on, Focusing on how the glass remains \"half-full\", Finding the silver lining in a dark cloud, Recognizing that loss is a natural part of life, Embracing healthy grief, Learning lessons from harsh consequences",
        meaning_rev = "Wallowing in unhealthy grief or self-pity, Refusing to move on and let go, Clinging to the past, Obsessing on past lives and past loves, Failing to live in the present, Beating yourself up over past mistakes, Allowing fear of failure to limit your efforts",
        qta = "How do I tend to deal with loss? \nWhat life lesson might I be learning now? \nHow can I shift my attention from the past to the future?",
        description = "A dark, cloaked figure, looking sideways at three prone cups two others stand upright behind him; a bridge is in the background, leading to a small keep or holding. Divanatory Meanings: It is a card of loss, but something remains over; three have been taken, but two are left; it is a card of inheritance, patrimony, transmission, but not corresponding to expectations; with some interpreters it is a card of marriage, but not without bitterness or frustration. Reversed: News, alliances, affinity, consanguinity, ancestry, return, false projects",
        picture = R.drawable.c05
    )

    val card28Cups06 = Card(
        id = 28,
        name = "Six Cups",
        suit = SuitEnum.CUPS,
        value = "6",
        keywords = "charity, sharing, sacrifice, cooperation, fairness",
        fortuneTelling = "A stingy spirit is strangling your enjoyment of life. \nLoosen up and think of others for once, why don't you?",
        meaning_up = "Donating your time and talents to others, Taking satisfaction in knowing how your efforts will aid others, Creating a \"win-win\" scenario, Giving even when you know repayment is not possible, Being motivated to do a good deed",
        meaning_rev = "Linking your sense of self-worth to the appraisals of others, Striving to appear more needy than you really are, Taking undeserved or unmerited charity, Bragging about your charitable efforts, Profiteering in times of distress, Refusing to share a burden",
        qta = "What gifts do I possess? How freely do I give them? \nHow can I practice unconditional giving? \nHow would things change if I became a more charitable person?",
        description = "Children in an old garden, their cups filled with flowers.",
        picture = R.drawable.c06
    )

    val card29Cups07 = Card(
        id = 29,
        name = "Seven Cups",
        suit = SuitEnum.CUPS,
        value = "7",
        keywords = "imagination, dreams, illusions, goals",
        fortuneTelling = "You're being fed a line. \nRather than be dazzled by fancy words and promises, demand something real.",
        meaning_up = "Motivating yourself with images of future success, Using visualization to encourage progress, Taking an imaginative or creative approach to problem solving, Making dreams come true, Gleaning insight from personal visions",
        meaning_rev = "Obsessing on imaginary fears or uncertain consequences, Giving in to emotional or political terrorism, Spending more time dreaming than working, Failing to envision the possible repercussions of your choices, Being controlled by fear",
        qta = "What do you want most? What do you fear most? How are these related? \nHow is your imagination working for you? Against you? \nHow might a clearer personal vision help you choose a single cup from the many available?",
        description = "Strange chalices of vision, but the images are more especially those of the fantastic spirit.",
        picture = R.drawable.c07
    )

    val card30Cups08 = Card(
        id = 30,
        name = "Eight Cups",
        suit = SuitEnum.CUPS,
        value = "8",
        keywords = "imagination, dreams, illusions, goals",
        fortuneTelling = "Someone's \"stepping out\" on you, now or in the near future. \nMaybe it's time to quit talking about the problem and just move on.",
        meaning_up = "Wanting something better, Blazing your own trail, Realizing there must be more to life, Leaving an unhealthy situation behind, Starting your own business, Going on a retreat, Seeking the \"still, small voice\"",
        meaning_rev = "Being implacable, Finding fault, Nitpicking, Refusing to settle down, Running away from problems or confrontations, Saying, \"It's my way or the highway!\", Harping on past mistakes and disappointments, Threatening to quit as a strategy to get your way",
        qta = "What do I need to leave behind once and for all? \nIf I left in search of \"more,\" what would I be looking for, exactly? \nHow might a retreat enhance my perspective?",
        description = "A man of dejected aspect is deserting the cups of his felicity, enterprise, undertaking or previous concern.",
        picture = R.drawable.c08
    )

    val card31Cups09 = Card(
        id = 31,
        name = "Nine Cups",
        suit = SuitEnum.CUPS,
        value = "9",
        keywords = "satisfaction, sensuality, luxury, pleasure",
        fortuneTelling = "Whatever you want, you'll get it",
        meaning_up = "Being delighted with your own achievements, Recognizing your own talents and abilities, Reveling in the good things life has to offer, Indulging yourself, Relaxing and unwinding, Having everything you need in order to feel complete",
        meaning_rev = "Being smug, Satisfying yourself at the expense of others, Being selfish, Over-indulging, Avoiding work that needs to be done, Claiming achievements or skills you do not possess, Never being satisfied, no matter how much you have",
        qta = "What is true happiness? \nIf I could have anything, what would I have? \nWhat is my attitude toward luxury? Do I deserve it?",
        description = "A goodly personage has feasted to his heart's content, and abundant refreshment of wine is on the arched counter behind him, seeming to indicate that the future is also assured. The picture offers the material side only, but there are other aspects.",
        picture = R.drawable.c09
    )

    val card32Cups10 = Card(
        id = 32,
        name = "Ten Cups",
        suit = SuitEnum.CUPS,
        value = "10",
        keywords = "joy, fulfillment, overwhelming emotion, giddiness",
        fortuneTelling = "Marriage and family are in the cards. \nExpect a friendship to blossom into a romance.",
        meaning_up = "Having more than you ever dreamed, Being deeply thankful for all you've been given, Recognizing the Hand of God in the gifts the Universe brings your way, Experiencing transcendent joy, Achieving domestic bliss",
        meaning_rev = "Comparing your achievements or relationships to unrealistic fantasy standards, Experiencing emotions so intense they blunt your ability to cope with reality, Feeling overwhelmed, Envying the achievements and happiness of others",
        qta = "Who gets to define what \"joy\" consists of? \nWhat course of action is available when you feel overwhelmed? \nHow might vows or promises play a role in achieving a greater level of joy in your life?",
        description = "Appearance of Cups in a rainbow; it is contemplated in wonder and ecstacy by a man and woman below, evidently husband and wife. His right arm is about her; his left is raised upward; she raises her right arm. The two children dancing near them have not observed the prodigy but are happy after their own manner. There is a home-scene beyond.",
        picture = R.drawable.c10
    )

    val card33CupsPage = Card(
        id = 33,
        name = "Page of Cups",
        suit = SuitEnum.CUPS,
        value = "11",
        keywords = "enthusiasm, first impressions, romanticism, superficiality",
        fortuneTelling = "This card represents a young man or woman with a watery, dreamy demeanor, likely born a Libra, Scorpio, or Sagittarius, who wants to start a new relationship with you",
        meaning_up = "Showing your emotions freely, Throwing yourself into romance, Nursing a secret crush, Indulging in romantic fantasy, Starting a new relationship, Recalling your first love, Experiencing love for the first time, Converting to a new religion",
        meaning_rev = "Mistaking a crush for true love, Reading romantic intention into innocent action, Frantically trying to impress others, Indulging in overly-sweet sentimentality, Pretending to more romantic or spiritual experience than you possess",
        qta = "How worried are you that others will see you as foolish or inexperienced? \nTo what extent can you be honest about your lack of experience in love and faith? \nHow can you maintain enthusiasm over time?",
        description = "A youthful figure, looking intently at the pentacle which hovers over his raised hands. He moves slowly, insensible of that which is about him.",
        picture = R.drawable.c11
    )

    val card34CupsKnight = Card(
        id = 34,
        name = "Knight of Cups",
        suit = SuitEnum.CUPS,
        value = "12",
        keywords = "fervor, zeal, moodiness, illumination",
        fortuneTelling = "This card represents a man with an emotional, sensitive personality, likely born between October 13th and November 11th, who wants you to rally around his latest passionate cause",
        meaning_up = "Being deeply committed to a cause, Giving in to strong emotions, from excitement to depression, Acting on intuition alone, Solving problems intuitively, Believing in and basing decisions on ideals instead of realities, Bringing intuition or passion to the table",
        meaning_rev = "Becoming a fanatic, Rejecting information that suggests your intuitions are misguided, Allowing your emotions to control you, Giving in to jealousy, confrontation, and peer pressure, Hiding or ignoring intuitive insights",
        qta = "How prone to emotional extremes are you? \nWhat's the difference in driving passion and blind zeal? \nHow can you inspire others without inciting a riot?",
        description = "He rides a slow, enduring, heavy horse, to which his own aspect corresponds. He exhibits his symbol, but does not look therein.",
        picture = R.drawable.c12
    )

    val card35CupsQueen = Card(
        id = 35,
        name = "Queen of Cups",
        suit = SuitEnum.CUPS,
        value = "13",
        keywords = "insightfulness, spirituality, compassion, empathy, instinct",
        fortuneTelling = "This card represents a woman with an emotional, deeply spiritual nature, likely born between June 11th and July 11th, who uses emotional and spiritual appeals to sway others to her point of view",
        meaning_up = "Allowing yourself to be moved by the plight of others, Feeling strong emotions, Possessing unusual sympathy or empathy, Trusting your feelings to guide you, Calling on psychic abilities, Achieving unity with Spirit",
        meaning_rev = "Becoming so caught up in matters of Spirit, you become detached from the world, Allowing empathy to disable you (instead of inspire action), Using psychic abilities to wield covert influence, Wallowing in emotionalism, sentiment, or self-pity",
        qta = "How do I handle strong emotions? \nTo what extent am I a victim of my own feelings? \nHow can I move from reflection to action?",
        description = "The face suggests that of a dark woman, whose qualities might be summed up in the idea of greatness of soul; she has also the serious cast of intelligence; she contemplates her symbol and may see worlds therein.",
        picture = R.drawable.c13
    )

    val card36CupsKing = Card(
        id = 36,
        name = "King of Cups",
        suit = SuitEnum.CUPS,
        value = "14",
        keywords = "wisdom, diplomacy, restraint, composure",
        fortuneTelling = "This card represents an older man with a gentle, sensitive presence, likely born between February 9th and March 10th, who is known for his fairness and tolerance",
        meaning_up = "Keeping a stiff upper lip, Being brave and clear in the face of adverse circumstances, Sharing experience as a way of comforting others, Making fair and empathetic decisions, Honoring the spirit, not just the letter, of the law",
        meaning_rev = "Allowing yourself to become rigid and unemotional, Making unfair decisions based on a hidden agenda, Making decisions without regard for their emotional impact on others, Abusing spiritual authority, Using emotional or spiritual leverage to exercise unhealthy control over others",
        qta = "What wise person could be consulted for good advice? \nHow can I make sure I'm being as objective and fair as possible? \nTo what extent am I capable of keeping a \"stiff upper lip?\"",
        description = "The figure calls for no special description the face is rather dark, suggesting also courage, but somewhat lethargic in tendency. The bull's head should be noted as a recurrent symbol on the throne. The sign of this suit is represented throughout as engraved or blazoned with the pentagram, typifying the correspondence of the four elements in human nature and that by which they may be governed. In many old Tarot packs this suit stood for current coin, money, deniers. I have not invented the substitution of pentacles and I have no special cause to sustain in respect of the alternative. But the consensus of divinatory meanings is on the side of some change, because the cards do not happen to deal especially with questions of money.",
        picture = R.drawable.c14
    )


    // The Swords
    val card37Swords01 = Card(
        id = 37,
        name = "Ace of Swords",
        suit = SuitEnum.SWORDS,
        value = "1",
        keywords = "logic, objectivity, intellect, choice",
        fortuneTelling = "The time to make a choice is now. \nStop wavering and do what you know is best.",
        meaning_up = "Making objective decisions, Applying logic, Reasoning your way out of a difficult situation, Solving puzzles, Thinking things through, Emphasizing the facts, Clearing your mind, Seeking clarity",
        meaning_rev = "Applying ruthless or twisted logic, Gloating over your own superior intellect, Using quick thinking to deceive or confuse others, Confusing snap judgments with quick thinking, Making decisions without thinking through consequences",
        qta = "If I made my decision purely based on reason and logic, what would my decision be? \nWhat do I think about my own problem-solving ability? \nWho can supply me with the pure and simple facts?",
        description = "A hand issues from a cloud, grasping as word, the point of which is encircled by a crown.",
        picture = R.drawable.s01
    )

    val card38Swords02 = Card(
        id = 38,
        name = "Two Swords",
        suit = SuitEnum.SWORDS,
        value = "2",
        keywords = "denial, debate, impasse, truce",
        fortuneTelling = "Sometimes, the only way to win is to refuse to fight. \nYou're stuck for now; let time pass before taking action.",
        meaning_up = "Refusing to make a decision without getting the facts, Exploring both sides of an argument, Arguing passionately for what you believe in, Weighing the issues, Encouraging the open exchange of ideas, Discussing political or religious issues without getting \"hot under the collar\"",
        meaning_rev = "Rejecting evidence that conflicts with dearly-held beliefs, Arguing with others just for the sake of doing so, Nit-picking, Putting off a decision because you're afraid to face the consequences, Preventing others from getting the information they need to make good decisions",
        qta = "What information do I need to get past this impasse? \nHow can I get past being defensive and see the facts? \nWhat viewpoints, other than my own, play a role in this situation?",
        description = "A hoodwinked female figure balances two swords upon her shoulders.",
        picture = R.drawable.s02
    )

    val card39Swords03 = Card(
        id = 39,
        name = "Three Swords",
        suit = SuitEnum.SWORDS,
        value = "3",
        keywords = "variance, difference, dissatisfaction, heartache, rejection",
        fortuneTelling = "Breakups and infidelity abound. \nWhat hurts now, though, will turn out to be good for you later on.",
        meaning_up = "Being brave enough to see things as they really are, Exercising your critical eye, Being your own best critic, Acknowledging that things don't always turn out as planned, Moving past heartbreak to embrace a painful truth",
        meaning_rev = "Wallowing in despair, Allowing yourself to be completely crushed by the thoughts, words, or deeds of another, Judging yourself too harshly, Holding yourself to an unrealistic standard of excellence, Wearing your heart on your sleeve while carrying a chip on your shoulder",
        qta = "How can I get past my depression? \nTo what extent are my emotions a matter of choice? \nHow can I learn from the mistakes of the past?",
        description = "Three swords piercing a heart; cloud and rain behind.",
        picture = R.drawable.s03
    )

    val card40Swords04 = Card(
        id = 40,
        name = "Four Swords",
        suit = SuitEnum.SWORDS,
        value = "4",
        keywords = "meditation, contemplation, perspective, mindset",
        fortuneTelling = "Don't make any decision now. \nWait, and you'll be glad you did.",
        meaning_up = "Thinking over your plans before putting them into action, Pausing to meditate or clear your mind, Taking time to understand someone or something before criticizing it, Resting, Occupying your thoughts with a healthy distraction",
        meaning_rev = "Failing to think things through, Mistaking procrastination for thoughtfulness, Adopting a point of view and refusing to reconsider your conclusions, even when presented with refuting evidence, Allowing chaos and whimsy to dominate your thoughts",
        qta = "How long has it been since you deliberately took a \"time out?\"\nHow difficult is it for you to meditate? \nWhat would happen if you simply refused to make a decision today?",
        description = "The effigy of a knight in the attitude of prayer, at full length upon his tomb.",
        picture = R.drawable.s04
    )

    val card41Swords05 = Card(
        id = 41,
        name = "Five Swords",
        suit = SuitEnum.SWORDS,
        value = "5",
        keywords = "selfishness, hostility, irrationality, self-preservation",
        fortuneTelling = "Someone is stealing from you, financially or romantically. \nBe wary of friends who talk behind your back.",
        meaning_up = "Acting in your own best interest, Choosing to stand up for yourself, Not backing down from disagreement and discord, Taking a stand, Refusing to go along with an unethical plan",
        meaning_rev = "Taking advantage of others, Intimidating others, Acting in an unethical manner, Picking fights, Using words to goad others into violence and irrationality, Ignoring rules you've agreed to abide by, Looking out for yourself while allowing harm to come to others, Gloating over victory",
        qta = "How do I behave when I win? What does that say about me? \nHow can I do what's necessary without making others feel defeated? \nWhat's the difference between selfish action and acting in my own best interest?",
        description = "A disdainful man looks after two retreating and dejected figures. Their swords lie upon the ground. He carries two others on his left shoulder, and a third sword is in his right hand, point to earth. He is the master in possession of the field.",
        picture = R.drawable.s05
    )

    val card42Swords06 = Card(
        id = 42,
        name = "Six Swords",
        suit = SuitEnum.SWORDS,
        value = "6",
        keywords = "adaptation, adjustments, science, travel",
        fortuneTelling = "You'll soon go on a long journey over water. \nActions have unexpected consequences, so be prepared.",
        meaning_up = "Making the best of a bad situation, Recovering from defeat, Resetting expectations, Making allowances for unexpected circumstances, Helping others who find themselves in dire circumstances, Changing the way you see the world, Broadening your perspective through study or travel",
        meaning_rev = "Refusing to accept that things have changed, Playing the victim, Rejecting the idea that your actions have consequences, Applying scientific criteria to matters of faith, or confusing faith with science, Believing the whole world should be like your small corner of it",
        qta = "What assumptions govern my thinking? \nHow willing am I to lend aid to others? To request it when I need it? \nHow prepared am I to deal with change? With unexpected outcomes?",
        description = "A ferryman carrying passengers in his punt to the further shore. The course is smooth, and seeing that the freight is light, it may be noted that the work is not beyond his strength.",
        picture = R.drawable.s06
    )

    val card43Swords07 = Card(
        id = 43,
        name = "Seven Swords",
        suit = SuitEnum.SWORDS,
        value = "7",
        keywords = "dishonesty, presumption, sneakiness, assumptions",
        fortuneTelling = "Don't assume people around you are worthy of your trust. \nAsk for an accounting of where people have been, and what they've been doing.",
        meaning_up = "Refusing to do something dishonest, even when there's no chance of ever being caught, Handling a difficult situation with finesse, Pointing out assumptions, Acting ethically in public and in private, Living a life that is beyond reproach",
        meaning_rev = "Stealing or lying, Doing whatever you can get away with, simply because you can, Looking for a way around consequences, Justifying wicked behavior by focusing on the wickedness of others, Failing to examine your own motives and prejudices",
        qta = "What assumptions am I making? \nHow well-defined is my sense of ethics? \nHow should I respond when I know others are breaking the rules?",
        description = "A man in the act of carrying away five swords rapidly; the two others of the card remain stuck in the ground. A camp is close at hand.",
        picture = R.drawable.s07
    )

    val card44Sowrds08 = Card(
        id = 44,
        name = "Eigth Swords",
        suit = SuitEnum.SWORDS,
        value = "8",
        keywords = "restriction, limitation, confinement, helplessness",
        fortuneTelling = "Get over playing the victim. \nOnce you realize you are your own biggest obstacle, nothing can hold you back.",
        meaning_up = "Honoring limits, Respecting the rules, Deciding to go on a diet for your health's sake, Recognizing you cannot always be in control, Identifying obstacles to further progress, Refusing to think about unhealthy or unethical options, Asking for assistance",
        meaning_rev = "Feeling trapped, Being lost in a maze of rules and regulations, Giving in to despair, Playing the victim, Allowing others to dictate what you can and cannot do, Being rendered helpless, Having very few options, Failing to look for a way out",
        qta = "Who's empowered to cut through the red tape? \nWhat, exactly, are the obstacles? What resources, exactly, are needed to move them? \nTo what extent is your powerlessness a matter of attitude?",
        description = "A woman, bound and hoodwinked, with the swords of the card about her. Yet it is rather a card of temporary durance than of irretrievable bondage.",
        picture = R.drawable.s08
    )

    val card45Swords09 = Card(
        id = 45,
        name = "Nine Swords",
        suit = SuitEnum.SWORDS,
        value = "9",
        keywords = "remorse, worry, distraught, conclusion",
        fortuneTelling = "If you take the action you're considering now, you'll be sorry in the future.",
        meaning_up = "Refusing to worry about what you cannot control, Rejecting anxiety, Judging your own performance with kindness and gentleness, Using meditation to quiet a troubled mind, Confronting nightmares and fears, Drawing a conclusion and putting an issue out of your mind",
        meaning_rev = "Torturing yourself with regrets, Second-guessing your every move, Beating yourself up for your mistakes, Depression, Obsessing on errors and overlooked details, Refusing to handle stress in healthy ways, Ruining your ability to appreciate the present by dwelling on the past, Debating irreversible decisions",
        qta = "What role does worry play in your current situation? \nTo what other ends might you devote the energy you're giving to anxiety? \nHow can you know when it's time to stop thinking and start acting?",
        description = "One seated on her couch in lamentation, with the swords over her. She is as one who knows no sorrow which is like unto hers. It is a card of utter desolation.",
        picture = R.drawable.s09
    )

    val card46Swords10 = Card(
        id = 46,
        name = "Ten Swords",
        suit = SuitEnum.SWORDS,
        value = "10",
        keywords = "exhaustion, ruin, disaster, stamina, obsession",
        fortuneTelling = "Disaster! \nPut off plans and do not take action until omens are better.",
        meaning_up = "Seeing the signs that you've reached your limits, Paying attention to what your body is trying to tell you, Giving in to the need for rest and renewal, Acknowledging that you've hit bottom, Committing to a turnaround, Knowing the worst is over",
        meaning_rev = "Accepting defeat prematurely, Driving yourself to total exhaustion, especially mentally, Experiencing a mental breakdown, Obsessing on a problem to the breaking point, Giving up, Refusing to move from thought to action, Deeply unhealthy thoughts",
        qta = "What are the signs that the time for debate is over? \nHow can you tell when interest has given way to obsession? \nWhen your own limits are reached, where can you turn for aid?",
        description = "A prostrate figure, pierced by all the swords belonging to the card.",
        picture = R.drawable.s10
    )

    val card47SwordsPage = Card(
        id = 47,
        name = "Page of Swords",
        suit = SuitEnum.SWORDS,
        value = "11",
        keywords = "student, apprentice, scholarship, information",
        fortuneTelling = "This card represents a young man or woman with an airy, intellectual demeanor, likely born a Capricorn, Aquarius, or Pisces, who wants to learn something new from you or have a discussion with you.",
        meaning_up = "Pursuing a course of study, Asking good questions, Investing time in study and practice, Doing research, Making a habit of learning new things, Starting an investigation, Outlining what you need to know, Finding a mentor or teacher",
        meaning_rev = "Pretending to knowledge or sophistication you do not possess, Cheating on an exam, Feigning interest as a way of gaining favor, Considering only the evidence that supports conclusions you've already drawn, Rejecting the wise counsel of experienced teachers",
        qta = "How comfortable are you with revealing your own ignorance? \nWhat are the marks of a good student? \nTo what extent are you open to new information?",
        description = "A lithe, active figure holds a sword upright in both hands, while in the act of swift walking. He is passing over rugged land, and about his way the clouds are collocated wildly. He is alert and lithe, looking this way and that, as if an expected enemy might appear at any moment.",
        picture = R.drawable.s11
    )

    val card48SwordsKnight = Card(
        id = 48,
        name = "Knight of Swords",
        suit = SuitEnum.SWORDS,
        value = "12",
        keywords = "bluntness, intelligence, incisiveness, investigation",
        fortuneTelling = "A blunder leads someone to say something he or she regrets. \nIf this was you, be prepared to apologize and move on.",
        meaning_up = "Speaking your mind, Making your opinions known, Offering constructive criticism, Sharing your knowledge, Making insightful observations, Pinpointing the problem, Clarifying what others have said, Giving clear direction to others, Uncovering the truth",
        meaning_rev = "Stating your opinions as fact, Picking fights, Starting arguments, Using clever insults to undermine the confidence of others, Tossing reason out the window, Speaking without taking the feelings of others into account, Going on a witch hunt, Distorting evidence",
        qta = "What do I really need to know? \nTo what extent have I investigated the facts behind my situation? \nHow can I share what I know without alienating others?",
        description = "He is riding in full course, as if scattering his enemies. In the design he is really a prototypical hero of romantic chivalry. He might almost be Galahad, whose sword is swift and sure because he is clean of heart.",
        picture = R.drawable.s12
    )

    val card49SwordsQueen = Card(
        id = 49,
        name = "Queen of Swords",
        suit = SuitEnum.SWORDS,
        value = "13",
        keywords = "grace, skill, wit, charm, aptitude",
        fortuneTelling = "This card represents a woman with an artistic, intellectual nature, likely born between September 12th and October 12th, who uses clever, positive communication to sway others to her point of view.",
        meaning_up = "Exercising tact or using diplomacy, Defusing a tense situation, Knowing what to say and how to say it, Making others feel comfortable and confident, Bringing out the best in everyone, Having a way with words, Telling jokes, Possessing a knack for music, math, art, or science",
        meaning_rev = "Knowing exactly what to say to destroy another person, Withholding critical information, Using a barbed tongue to upset others, Employing sarcasm, Mimicking others unkindly, Making light of the less fortunate, Being disrespectful, Failing to use the talent you've been given",
        qta = "What do I have a knack for? How might my special gift prove useful now? \nTo what extent am I capable of saying what needs to be said? \nWhat is the best possible way to say what I want to say?",
        description = "Her right hand raises the weapon vertically and the hilt rests on an arm of her royal chair the left hand is extended, the arm raised her countenance is severe but chastened; it suggests familiarity with sorrow. It does not represent mercy, and, her sword notwithstanding, she is scarcely a symbol of power.",
        picture = R.drawable.s13
    )

    val card50SwordsKing = Card(
        id = 50,
        name = "King of Swords",
        suit = SuitEnum.SWORDS,
        value = "14",
        keywords = "expertise, decision, verdict, genius",
        fortuneTelling = "This card represents an older man with an insightful, deliberate spirit, likely born between May 11th and June 10th, who is known for his integrity and sharp decision-making ability.",
        meaning_up = "Expressing yourself with firmness and authority, Rendering a final decision, Consulting an expert, Calling in advisors and consultants, Coming to a final conclusion, Reaching a beneficial agreement based on sound information",
        meaning_rev = "Insisting on having the last word, Flaunting your intellectual capability, Talking \"over the heads\" of others, Waffling on an important decision, Constantly changing your mind, Refusing to make choices that are in your own best interest, Wishing in vain you could take back what's been said",
        qta = "What would your decision be if you had to render a binding verdict right now? \nHow comfortable are you saying exactly what you mean? How often do you temper what you have to say for fear of offending others? \nIf you were to ask others, \"What's my area of expertise?\" what would they say?",
        description = "He sits in judgment, holding the unsheathed sign of his suit. He recalls, of course, the conventional Symbol of justice in the Trumps Major, and he may represent this virtue, but he is rather the power of life and death, in virtue of his office.",
        picture = R.drawable.s14
    )


    // The Wands
    val card51Wands01 = Card(
        id = 51,
        name = "Ace of Wands",
        suit = SuitEnum.WANDS,
        value = "1",
        keywords = "desire, inspiration, vision, creation, invention",
        fortuneTelling = "Someone has the \"hots\" for you, A new job offer is coming your way, Walk softly, and carry a big stick",
        meaning_up = "Being inspired, Identifying an important goal, Being given the opportunity to do whatever you want to do, Giving or receiving direction, Seeing a solution, Creating something new, Being aroused, sexually or creatively",
        meaning_rev = "Failing to take advantage of a great opportunity, Being ineffectual or lazy, Making an inadequate effort, Working toward a goal, but lacking the resources or initiative to achieve success, Setting inappropriate goals, Failing to take a stand",
        qta = "What do I really want, more than anything else? \nWhat happens if I let this opportunity pass me by? \nHow clearly have I defined my directions, values, and goals?",
        description = "A hand issuing from a cloud grasps a stout wand or club.",
        picture = R.drawable.w01
    )

    val card52Wands02 = Card(
        id = 52,
        name = "Two Wands",
        suit = SuitEnum.WANDS,
        value = "2",
        keywords = "conflict, decision, option, individuality",
        fortuneTelling = "Beware false friends. \nDon't be mealy-mouthed; say what you think and do what you want to do.",
        meaning_up = "Having a choice, Offering or being offered an option, Seeing the value of another person's approach, Understanding there's more than one way to \"skin a cat\", Successfully doing more than one thing at a time, Being empowered to make a choice",
        meaning_rev = "Misrepresenting your intentions, Doing one thing while desiring another, Changing course mid-stream for no good reason, Refusing to change your goal even when pursuing it no longer makes sense, Disregarding the input of others",
        qta = "In a conflict, how do you decide who wins? \nWhat values govern your decision-making process? \nWhat choice will you make if you make no choice at all?",
        description = "A tall man looks from a battlemented roof over sea and shore; he holds a globe in his right hand, while a staff in his left rests on the battlement; another is fixed in a ring. The Rose and Cross and Lily should be noticed on the left side.",
        picture = R.drawable.w02
    )

    val card53Wands03 = Card(
        id = 53,
        name = "Three Wands",
        suit = SuitEnum.WANDS,
        value = "3",
        keywords = "implementation, action, exploration",
        fortuneTelling = "You'll be planning a trip soon. \nBe on the lookout: your ship is coming in.",
        meaning_up = "Putting a plan into motion, Taking that critical first step, Making good things happen, Going beyond your limits, Blazing new trails, Hitting the ground running, Seeing your plans come to fruition",
        meaning_rev = "Procrastinating, Knowing what to do, but refusing to do it, Launching a project without a clear definition of who should do what, Rejecting an opportunity to try something new, Failing to finish what you start",
        qta = "How can you make a habit of breaking your habits? \nHow can you be a decisive leader in this circumstance? \nWhat's your action plan for the next week, month, year, or decade?",
        description = "A calm, stately personage, with his back turned, looking from a cliff's edge at ships passing over the sea. Three staves are planted in the ground, and he leans slightly on one of them.",
        picture = R.drawable.w03
    )

    val card54Wands04 = Card(
        id = 54,
        name = "Four Wands",
        suit = SuitEnum.WANDS,
        value = "4",
        keywords = "celebration, jubilation, community, teamwork, completion",
        fortuneTelling = "Someone is watching and evaluating your work. \nYou may get a wedding invitation soon.",
        meaning_up = "Sharing in a great celebration, Sharing in a communal sense of achievement and success, Preparing for a party, Working together toward a common goal, Giving or winning awards",
        meaning_rev = "Keeping your nose to the grindstone, Recognizing good work by demanding more work, Failing to share in a group celebration, Allowing sour grapes to poison your moment in the sun, Refusing to do your part",
        qta = "To what extent am I doing my part? \nWhat kind of recognition would be most meaningful? \nHow might a celebration now impact community morale?",
        description = "From the four great staves planted in the foreground there is a great garland suspended; two female figures uplift nosegays; at their side is a bridge over a moat, leading to an old manorial house.",
        picture = R.drawable.w04
    )

    val card55Wands05 = Card(
        id = 55,
        name = "Five Wands",
        suit = SuitEnum.WANDS,
        value = "5",
        keywords = "confrontation, disruption, distinction, objection, strife",
        fortuneTelling = "Prepare for a fight with your best friend. \nRemember: once you let words loose, you can't take them back.",
        meaning_up = "Calmly expressing a dissenting opinion, Allowing someone to use his or her own methods to get a job done, Opening the floor for discussion or debate, Comparing progress made so far to standards set earlier",
        meaning_rev = "Berating others for their ridiculous opinions, Picking fights, Offering destructive criticism, Baiting people with barbed remarks, Disrupting progress with an endless stream of pointless objections",
        qta = "To what extent is your current issue worth fighting for? \nWhat alternatives are there to outright conflict? \nWhat happens in a \"fair fight?\" \nHow can you keep this fight fair?",
        description = "A posse of youths, who are brandishing staves, as if in sport or strife. It is mimic warfare, and hereto correspond the five wands.",
        picture = R.drawable.w05
    )

    val card56Wands06 = Card(
        id = 56,
        name = "Six Wands",
        suit = SuitEnum.WANDS,
        value = "6",
        keywords = "victory, achievement, success, triumph",
        fortuneTelling = "Someone is planning a party for you, but not everyone feels so good about your recent success. \nWatch out for envious friends.",
        meaning_up = "Outperforming your peers, Winning a competition, Being recognized as a capable person, Having your \"moment in the spotlight\", Being cheered on by the crowd, Getting an award, Earning the admiration of others, Telling someone, \"Good job!\"",
        meaning_rev = "Being a bad winner, Allowing your achievements to inflate your ego, Looking down on people who seem less capable, Craving to be the center of attention, Giving or receiving insincere praise, Envying the achievements of others",
        qta = "What kind of recognition do I crave? Why? \nHow freely do I praise the achievements of others? \nWhat happens when the parade is over?",
        description = "A laurelled horseman bears one staff adorned with a laurel crown; footmen with staves are at his side.",
        picture = R.drawable.w06
    )

    val card57Wands07 = Card(
        id = 57,
        name = "Seven Wands",
        suit = SuitEnum.WANDS,
        value = "7",
        keywords = "bravery, resolve, determination",
        fortuneTelling = "Don't be surprised by a personal attack. \nPrepare to defend yourself or someone you love.",
        meaning_up = "Refusing to be silenced through fear or intimidation, Continuing a fight against all odds, Being fierce, Defending yourself against physical and emotional attacks, Refusing to put up with abuse, Clinging to your values despite all pressure to abandon them",
        meaning_rev = "Having a chip on your shoulder, Taking unnecessary risks as a means of proving your fearlessness, Looking for an opportunity to take offense, Responding to constructive criticism with defensiveness, Refusing to stand up for yourself and your beliefs",
        qta = "When do you feel most threatened? When do you get defensive? \nHow capable are you of defending yourself? \nWhat kinds of beliefs are worth defending?",
        description = "A young man on a craggy eminence brandishing a staff; six other staves are raised towards him from below.",
        picture = R.drawable.w07
    )

    val card58Wands08 = Card(
        id = 58,
        name = "Eight Wands",
        suit = SuitEnum.WANDS,
        value = "8",
        keywords = "speed, swiftness, responsiveness, change",
        fortuneTelling = "Watch for a surprising letter in the mail. \nYour whole world is about to be turned on its ear.",
        meaning_up = "Taking swift action, Moving forward with a plan as quickly as possible, Energizing yourself, Adapting to sudden changes, Taking setbacks in stride, Embracing the idea that nothing stays the same forever, Reacting quickly and appropriately to unforeseen problems",
        meaning_rev = "Giving in to panic, Running in circles and screaming, Insisting things must always stay the same, Stirring the pot just to see what will happen, Rushing others, Refusing to re-evaluate a schedule or program, even when it's clearly no longer appropriate",
        qta = "How quickly to you adapt to change? \nWhat would your response be to overwhelming, sudden change? \nWhat changes are on your horizon? How well have you prepared for them?",
        description = "The card represents motion through the immovable-a flight of wands through an open country; but they draw to the term of their course. That which they signify is at hand; it may be even on the threshold.",
        picture = R.drawable.w08
    )

    val card59Wands09 = Card(
        id = 59,
        name = "Nine Wands",
        suit = SuitEnum.WANDS,
        value = "9",
        keywords = "toughness, persistence, stamina, loyalty, release",
        fortuneTelling = "Don't relax yet; there's more to come. \nThe test you're facing now is happening for one reason: to show you who your real friends are.",
        meaning_up = "Sticking with it for the duration, Fulfilling your promises and obligations, Bearing up under incredible duress, Dragging yourself across the finish line, Picking yourself up by your own bootstraps, Refusing to quit, Going as far as you can go and being satisfied with your performance",
        meaning_rev = "Making yourself a martyr, Abandoning your post, Giving up at the first sign of opposition, Being prevented from fulfilling an obligation, Failing to be dependable, Refusing to let something go that needs to be released, Beating a dead horse",
        qta = "How do you cope when things get really tough? \nWhen you get low, what encourages you to go on? \nAt what point should you be able to let this situation go?",
        description = "The figure leans upon his staff and has an expectant look, as if awaiting an enemy. Behind are eight other staves--erect, in orderly disposition, like a palisade.",
        picture = R.drawable.w09
    )

    val card60Wands10 = Card(
        id = 60,
        name = "Ten Wands",
        suit = SuitEnum.WANDS,
        value = "10",
        keywords = "exhaustion, resistance, burden, oppression",
        fortuneTelling = "You're worn out. \nBack off, take a time out, and let someone else handle things for a while.",
        meaning_up = "Holding your own in extreme circumstances, Helping others carry their burdens, Coming to the aid of the oppressed, Knowing and being honest about your own limits, Recognizing when you are not well-suited for a particular task",
        meaning_rev = "Taking on more work than you know you can handle, Refusing to say \"No\" when you're already overloaded, Making a habit of working overtime, Shielding others from facing the consequences of their own poor judgment, Over-extending yourself on a regular basis",
        qta = "How will you know when you reach the end of your rope? \nHow easily do you say no to new projects and requests? \nWhat projects could you delegate...or eliminate?",
        description = "A man oppressed by the weight of the ten staves which he is carrying.",
        picture = R.drawable.w10
    )

    val card61WandsPage = Card(
        id = 61,
        name = "Page of Wands",
        suit = SuitEnum.WANDS,
        value = "11",
        keywords = "enthusiasm, eagerness, confidence, validation, affirmation",
        fortuneTelling = "This card represents a young man or woman with a fiery, enthusiastic demeanor, likely born a Cancer, Leo, or Virgo, who wants to start a new relationship with you",
        meaning_up = "Leaping at a new opportunity, Being a cheerleader or ardent advocate for your cause, Being a True Believer, Taking first steps toward independence, Trusting in your own abilities, Asking for feedback",
        meaning_rev = "Basing your entire self-image on what others think, Seizing every new idea that comes your way without question, Habitually discounting input or feedback from others, Being so eager to \"do it yourself\" that you hinder your own progress",
        qta = "How easily do you admit your own inexperience? \nHow can you be a better student or employee? \nWhat qualities would make a total beginner's voyage of discovery easier?",
        description = "In a scene similar to the former, a young man stands in the act of proclamation. He is unknown but faithful, and his tidings are strange.",
        picture = R.drawable.w11
    )

    val card62WandsKnight = Card(
        id = 62,
        name = "Knight of Wands",
        suit = SuitEnum.WANDS,
        value = "12",
        keywords = "boldness, bravado, passion, persuasion, advocacy",
        fortuneTelling = "This card represents a man with a bold, passionate personality, likely born between July 12th and August 11th, who wants to sweep you off your feet",
        meaning_up = "Charging ahead, Making rapid progress, Refusing limits, Dazzling those around you with your wit and charm, Convincing others of your right to leadership, Convincing others to follow you, Being a catalyst for change",
        meaning_rev = "Blundering forward with inadequate skill or information, Running roughshod over the feelings of others, Using sex appeal to manipulate others, Forcing your leadership or ideology on others, Beginning many projects without finishing any",
        qta = "To what extent have you defined your ultimate goal? \nWhat's the fastest way to get the job done? Is this necessarily the best way? \nHow long has it been since you looked back to see if others really are following your lead?",
        description = "He is shewn as if upon a journey, armed with a short wand, and although mailed is not on a warlike errand. He is passing mounds or pyramids. The motion of the horse is a key to the character of its rider, and suggests the precipitate mood, or things connected therewith.",
        picture = R.drawable.w12
    )

    val card63WandsQueen = Card(
        id = 63,
        name = "Queen of Wands",
        suit = SuitEnum.WANDS,
        value = "13",
        keywords = "attention, attraction, unification, collaboration",
        fortuneTelling = "This card represents a woman with an attractive, appealing personality, likely born between March 11th and April 20th, who wants to charm you into doing things her way",
        meaning_up = "Paying close attention, Helping others focus on the issue at hand, Getting everyone to work together, Identifying common ground, Bringing people together, despite their differences, Using reverse psychology",
        meaning_rev = "Being distracted, or using your charms or skills to distract others from the goal, Calling attention to yourself with negative or unhealthy behaviors, Disrupting group activities as a means of feeding your own ego",
        qta = "How attentive am I? \nHow can I draw people's attention to what we have in common? \nTo what extent am I able to convince people to do what I want them to do?",
        description = "The Wands throughout this suit are always in leaf, as it is a suit of life and animation. Emotionally and otherwise, the Queen's personality corresponds to that of the King, but is more magnetic.",
        picture = R.drawable.w13
    )

    val card64WandsKing = Card(
        id = 64,
        name = "King of Wands",
        suit = SuitEnum.WANDS,
        value = "14",
        keywords = "creativity, ingenuity, achievement, direction",
        fortuneTelling = "This card represents an older man with a commanding, charismatic personality, likely born between November 13th and December 12th, who prefers to give directions and have them followed",
        meaning_up = "Putting old things together in new and exciting ways, Coming up with unexpected solutions, Using your experience to solve puzzles and problems, Doing what you set out to do, Directing the efforts of others",
        meaning_rev = "Using your creativity to get out of honest work, Investing great energy in avoiding responsibility, Boasting about achievements without putting your expertise to practical use, Lording it over others",
        qta = "How confident a leader am I? \nHow can I project more confidence? \nHow can I offer my expertise in ways that inspire others to follow me?",
        description = "The physical and emotional nature to which this card is attributed is dark, ardent, lithe, animated, impassioned, noble. The King uplifts a flowering wand, and wears, like his three correspondences in the remaining suits, what is called a cap of maintenance beneath his crown. He connects with the symbol of the lion, which is emblazoned on the back of his throne.",
        picture = R.drawable.w14
    )

    val card65Coins01 = Card(
        id = 65,
        name = "Ace of Pentacles",
        suit = SuitEnum.COINS,
        value = "1",
        keywords = "health, wealth, practicality, receiving",
        fortuneTelling = "Your health will improve. \nThe check you're looking for really is in the mail.",
        meaning_up = "Outlining a plan for achieving prosperity, Becoming aware of opportunities to improve income or health, Realizing you have everything you need, Appreciating everything the Universe has given you, Receiving the perfect gift at the perfect time",
        meaning_rev = "Indulging in relentless consumerism, Wanting more, no matter how much you have, Obsessing on your account balance, Suffering from hypochondria, Consuming blessings without expressing gratitude, Taking what you want without concern for the needs of others",
        qta = "If I made my decision based solely on practical concerns, what would my decision be? \nWhat resources are available to me? \nWhat will be the physical and financial impact of my decisions?",
        description = "A hand--issuing, as usual, from a cloud--holds up a pentacle.",
        picture = R.drawable.p01
    )

    val card66Coins02 = Card(
        id = 66,
        name = "Two Coins",
        suit = SuitEnum.COINS,
        value = "2",
        keywords = "evaluation, decision, budgeting, diagnosis",
        fortuneTelling = "It's time to balance the budget. \nAvoid the temptation to spend critical funds on frivolous goods.",
        meaning_up = "Weighing options, Comparing prices, Determining the value of one option over another, Juggling resources to make ends meet, Making difficult choices based on what's best for your body or your bankbook, Looking at the bottom line, Asking for a second opinion on health issues",
        meaning_rev = "Engaging in endless price comparison, Putting off a buying decision for fear of finding a slightly better value later on, Buying something without regard for value, Breaking your budget with unnecessary expenses, Engaging in behavior with no regard for how your body or bankbook will be impacted",
        qta = "What values govern my decisions? \nHow willing am I to sacrifice a little pleasure now in order to have more pleasure later on? \nGiven my current situation, which course of action will give me more of what I really need?",
        description = "A young man, in the act of dancing, has a pentacle in either hand, and they are joined by that endless cord which is like the number 8 reversed.",
        picture = R.drawable.p02
    )

    val card67Coins03 = Card(
        id = 67,
        name = "Three Coins",
        suit = SuitEnum.COINS,
        value = "3",
        keywords = "expression, production, work, contribution",
        fortuneTelling = "A high-dollar contract is in your future. \nIf you work hard, you'll succeed.",
        meaning_up = "Finishing a project, Setting and meeting standards, Performing according to specifications, Making something others value, Creating something new, Doing your part in a group project, Delivering exactly what others have asked for",
        meaning_rev = "Pandering to the tastes of others, Failing to deliver what you've promised, Not delivering your best work unless closely supervised, Ignoring or breaking agreements with those who have invested in you, Refusing to do your part, Failing to abide by a clearly-outlined agreement with yourself or others",
        qta = "How can I get more done? \nWhat's expected of me? How large a role do I play in controlling those expectations? \nWhat's been agreed to? How well has that agreement been followed?",
        description = "A sculptor at his work in a monastery. Compare the design which illustrates the Eight of Pentacles. The apprentice or amateur therein has received his reward and is now at work in earnest.",
        picture = R.drawable.p03
    )

    val card68Coins04 = Card(
        id = 68,
        name = "Four Coins",
        suit = SuitEnum.COINS,
        value = "4",
        keywords = "protection, conservation, preservation, safety",
        fortuneTelling = "A rainy day is coming - it's time to save",
        meaning_up = "Saving for a rainy day, Fasting as part of a spiritual practice, Dieting in an effort to improve your body, Abstaining from sex as a way of honoring a spiritual tradition or personal promise, Being financially conservative, Establishing a trust fund, Opening a savings account",
        meaning_rev = "Being stingy, Refusing to spend money that needs to be spent, Withholding sex from your partner, Taking care of your own needs exclusively, without regard for the needs of others, Spending a dollar to save a penny, Failing to be a good manager of the blessings you've been given",
        qta = "What factors determine how conservative or generous you are? \nWhat kinds of things must be preserved at all costs? \nWhen is greediness or stinginess a good trait to have? When might generosity work against you?",
        description = "A crowned figure, having a pentacle over his crown, clasps another with hands and arms; two pentacles are under his feet. He holds to that which he has.",
        picture = R.drawable.p04
    )

    val card69Coins05 = Card(
        id = 69,
        name = "Five Coins",
        suit = SuitEnum.COINS,
        value = "5",
        keywords = "poverty, destitution, need, crisis",
        fortuneTelling = "Finances are getting tighter, \nPrepare for a setback.",
        meaning_up = "Recognizing your needs and taking action to fulfill them, Doing as much as you can do with what little you have, Admitting you need help, Embracing the aid that comes your way, Focusing on what you have versus what you don't, Looking for the light at the end of the tunnel",
        meaning_rev = "Exaggerating your financial or physical needs, Adopting a poverty mentality, Refusing to support yourself, Refusing offers of support, Playing the martyr, Turning down opportunities to improve your health or finances, Wallowing in misery",
        qta = "What critical resources do I lack? \nWhat people or groups would come to my aid if I asked? \nHow might an impoverished spirit be impacting my physical or financial condition?",
        description = "Two mendicants in a snow-storm pass a lighted casement.",
        picture = R.drawable.p05
    )

    val card70Coins06 = Card(
        id = 70,
        name = "Six Coins",
        suit = SuitEnum.COINS,
        value = "6",
        keywords = "charity, fairness, cooperation, sharing",
        fortuneTelling = "When you need help, ask for it. \nRemember, though: what you receive may be limited by what you've given to others in the past.",
        meaning_up = "Giving time, money, or effort to a charity, Taking part in a group effort, Lending your resources to others without expecting anything in return, Making sure everyone is treated equally, Working together toward a common goal, Redistributing wealth, time, or attention, Tithing, Sharing credit for your success",
        meaning_rev = "Making a loan as a means of gaining control over someone, Using charitable acts to draw attention to yourself, Dividing work or resources unfairly, Failing to do your part in a group effort, Ignoring obligations and commitments",
        qta = "How do I feel about charity? About giving it? About receiving it? \nHow can I know if I'm treating others fairly? \nWhat could I give that no one else can?",
        description = "A person in the guise of a merchant weighs money in a pair of scales and distributes it to the needy and distressed. It is a testimony to his own success in life, as well as to his goodness of heart.",
        picture = R.drawable.p06
    )

    val card71Coins07 = Card(
        id = 71,
        name = "Seven Coins",
        suit = SuitEnum.COINS,
        value = "7",
        keywords = "assessment, evaluation, re-evaluation, reflection",
        fortuneTelling = "Things won't work out as expected. \nPick up the pieces and prepare to move on.",
        meaning_up = "Looking at results with an eye toward improving performance, Asking, \"How happy am I?\", Coming up with ideas for improving your health or prosperity, Deciding it's time for a change, Expressing an honest opinion",
        meaning_rev = "Becoming distracted by melancholy thoughts, Longing for \"the good old days\", Beating yourself up over lost opportunities, Judging your own work harshly, Holding others to inappropriate standards, Refusing to take part in a project, then whining about the quality of the outcome",
        qta = "To what extent have I fulfilled my own expectations? \nWhat are the terms of success? \nHow can I be happier with the progress I've made?",
        description = "A young man, leaning on his staff, looks intently at seven pentacles attached to a clump of greenery on his right; one would say that these were his treasures and that his heart was there.",
        picture = R.drawable.p07
    )

    val card72Coins08 = Card(
        id = 72,
        name = "Eight Coins",
        suit = SuitEnum.COINS,
        value = "8",
        keywords = "effort, work diligence, skill",
        fortuneTelling = "Stop over-analyzing, researching, and outlining. \nBuckle down and get the work done.",
        meaning_up = "Doing your best, Bringing enthusiasm and zeal to your work, Making an effort to be the best you can be, Finding the work that is right for you, Taking care of the small details, Becoming a finely skilled craftsperson, Building something with your hands, Making a handmade gift",
        meaning_rev = "Working yourself to death, Doing a half-hearted or sloppy job, Continuing in a job you hate, Buying thoughtless gifts, Producing work with shoddy craftsmanship, Rushing through your work, Rejecting opportunities to learn more about your craft",
        qta = "How long has it been since you were \"lost in your work?\" \nHow can you improve your level of dedication and focus? \nWhat work do you do best? What about that work appeals to you?",
        description = "An artist in stone at his work, which he exhibits in the form of trophies.",
        picture = R.drawable.p08
    )

    val card73Coins09 = Card(
        id = 73,
        name = "Nine Coins",
        suit = SuitEnum.COINS,
        value = "9",
        keywords = "training, discipline, confidence, enough",
        fortuneTelling = "Until you appreciate what you have, you won't have any luck getting more.",
        meaning_up = "Investing time in learning or teaching a difficult task, Restraining yourself from physical or financial extremes, Making sacrifices as a way of achieving larger goals, Breaking a complex task down into simple steps, Wanting what you have, Knowing the difference between needs and wants",
        meaning_rev = "Being assigned to a task without being trained to perform it, Pursuing a position for which you are not qualified, Disregarding requirements, Refusing to dedicate adequate time or attention when learning about something or someone new, Always craving more",
        qta = "If you could not have what you want, how would you make do? \nCould you make a complex task easier by breaking it down into smaller steps? \nHow patient are you during the learning process? With yourself? With others?",
        description = "A woman, with a bird upon her wrist, stands amidst a great abundance of grapevines in the garden of a manorial house. It is a wide domain, suggesting plenty in all things. Possibly it is her own possession and testifies to material well-being.",
        picture = R.drawable.p09
    )

    val card74Coins10 = Card(
        id = 74,
        name = "Ten Coins",
        suit = SuitEnum.COINS,
        value = "10",
        keywords = "wealth, abundance, acquisition, greed",
        fortuneTelling = "Big money is in the near future. \nExpect a powerful blessing to come your way.",
        meaning_up = "Celebrating your physical and financial blessings, Realizing how lucky or how blessed you are, Being satisfied with your physical and financial achievements, Taking best advantage of \"times of plenty\", Enjoying a feast, Showering friends or family with gifts",
        meaning_rev = "Spending all of your money on extravagant gifts and possessions, Trying too hard to impress others with your wealth or physique, Giving an inappropriately expensive gift as a means of currying favor, Obsessing on matters of weight, health, or finance, Always asking, \"What's in it for me?\"",
        qta = "How much stuff do I really need? \nHow do I feel about wealth and abundance? How do I define these terms? \nHow might shedding some possessions open room for growth?",
        description = "A man and woman beneath an archway which gives entrance to a house and domain. They are accompanied by a child, who looks curiously at two dogs accosting an ancient personage seated in the foreground. The child's hand is on one of them.",
        picture = R.drawable.p10
    )

    val card75CoinsPage = Card(
        id = 75,
        name = "Page of Coins",
        suit = SuitEnum.COINS,
        value = "11",
        keywords = "practicality, prosperity, learning, growth, adolescence",
        fortuneTelling = "This card represents a young man or woman with an earthy, practical demeanor, likely born an Aries, Taurus, or Gemini, who playfully encourages you to take financial or sexual risks.",
        meaning_up = "Learning the value of a dollar, Starting a savings plan, Taking the first steps toward getting out of debt, Learning new physical tasks, Discovering your sexuality, Launching a diet, a weight-lifting program, or a health-related effort, Learning by doing",
        meaning_rev = "Trying to appear healthier or wealthier than you really are, Spending money carelessly, Living strictly for today, with no thought of tomorrow, Possessing immature attitudes toward sex and sexuality, Using wealth or beauty as an excuse for not having to learn and grow",
        qta = "How can you get more financial or sexual experience without risking your livelihood or health? \nHow might hands-on learning play a role in your situation? \nWhat's the most practical choice you could make?",
        description = "A youthful figure, looking intently at the pentacle which hovers over his raised hands. He moves slowly, insensible of that which is about him.",
        picture = R.drawable.p11
    )

    val card76CoinsKnight = Card(
        id = 76,
        name = "Knight of Coins",
        suit = SuitEnum.COINS,
        value = "12",
        keywords = "caution, focus, realism, invention",
        fortuneTelling = "A stingy person may chide you for spending money. \nBe prepared to defend an economic or sexual decision.",
        meaning_up = "Spending money wisely, Saving for a rainy day, Paying close attention to physical or financial details, Knowing where every dollar goes, Having safe sex, Preferring facts to \"good feelings\", Finding creative ways to \"make do\" with resources on hand, Completing a new invention",
        meaning_rev = "Throwing caution to the four winds, Spending without regard for consequence, Spending on luxury when necessities are lacking, Escaping stress by spending money, Obsessing on tiny physical or financial details, Perpetually chasing after some new bauble, Copying another's work and claiming it as your own",
        qta = "What's the difference between caution and fear? \nHow can I evaluate the practicality of my own ideas and methods? \nHow realistic are my goals?",
        description = "He rides a slow, enduring, heavy horse, to which his own aspect corresponds. He exhibits his symbol, but does not look therein.",
        picture = R.drawable.p12
    )

    val card77CoinsQueen = Card(
        id = 77,
        name = "Queen of Coins",
        suit = SuitEnum.COINS,
        value = "13",
        keywords = "luxury, comfort, resourcefulness, generosity, prosperity",
        fortuneTelling = "This card represents a woman with an expansive, sensual nature, likely born between December 13th and 31st, who uses sensual appeal and the promise of reward to sway others to her point of view.",
        meaning_up = "Appreciating fine food, fine wine, beautiful art, beautiful bodies, or any of the better things in life, Reveling in healthy sexuality, Treating yourself, Splurging on the occasional \"nice to have\" item, Rewarding someone with compensation above and beyond expectations, Having it all",
        meaning_rev = "Indulging in gluttony or greediness, Becoming insatiable, Blunting the impact of treats by indulging in them too often, Providing physical comfort without providing for emotional needs, Allowing a feeling of entitlement to distort your gratitude for what you're given",
        qta = "How do I define luxury? \nTo what extent am I capable of reveling in sensual pleasure? \nWhat would I have to give up in order to \"have it all?\"",
        description = "The face suggests that of a dark woman, whose qualities might be summed up in the idea of greatness of soul; she has also the serious cast of intelligence; she contemplates her symbol and may see worlds therein.",
        picture = R.drawable.p13
    )

    val card78CoinsKing = Card(
        id = 78,
        name = "King of Coins",
        suit = SuitEnum.COINS,
        value = "14",
        keywords = "stability, dependability, confidence, intervention",
        fortuneTelling = "This card represents an older man with a financially, socially, and politically conservative spirit, likely born between August 12th and September 11th, who is known for putting his money where his mouth is.",
        meaning_up = "Becoming debt-free, Having more than enough to get by, Making contributions to a savings plan, Taking a new job with an eye toward advancing your career, Buying life or health insurance, Being confident in the bedroom, Taking on the role of enforcer when called upon to do so",
        meaning_rev = "Becoming so conservative you resist all change on principle alone, Ignoring innovations in the name of preserving tradition, Being smug or cocky, Becoming ruthlessly dedicated to profit or pleasure, Being sexually selfish, Bossing others around, especially when you're not empowered to do so",
        qta = "How can you handle expenses with greater confidence and maturity? \nHow dependable are you? How dependable would others say you are? \nTo what extent is a conservative viewpoint valuable? At what point does it become more of a burden than a blessing?",
        description = "The figure calls for no special description the face is rather dark, suggesting also courage, but somewhat lethargic in tendency. The bull's head should be noted as a recurrent symbol on the throne. The sign of this suit is represented throughout as engraved or blazoned with the pentagram, typifying the correspondence of the four elements in human nature and that by which they may be governed. In many old Tarot packs this suit stood for current coin, money, deniers. I have not invented the substitution of pentacles and I have no special cause to sustain in respect of the alternative. But the consensus of divinatory meanings is on the side of some change, because the cards do not happen to deal especially with questions of money.",
        picture = R.drawable.p14
    )


    /*
        val card78 = Card(
            id = 78,
            name = "",
            suit = SuitEnum.,
            value = "1",
            keywords = "",
            fortuneTelling = "",
            meaning_up = "",
            meaning_rev = "",
            qta = "",
            description = "",
            picture = "R.drawable.p14"
        )

     */


    val cardListRaw: List<Card> = listOf(
        //Major Arcana:
        card01TheFool,
        card02TheMagician,
        card03TheHighPriestess,
        card04TheEmpress,
        card05TheEmperor,
        card06TheHierophant,
        card07TheLovers,
        card08TheChariot,
        card09TheStrength,
        card10TheHermit,
        card11WheelOfFortune,
        card12Justice,
        card13TheHangedMan,
        card14Death,
        card15Temperance,
        card16TheDevil,
        card17TheTower,
        card18TheStar,
        card19TheMoon,
        card20TheSun,
        card21Judgement,
        card22TheWorld,
        // The Cups:
        card23Cups01,
        card24Cups02,
        card25Cups03,
        card26Cups04,
        card27Cups05,
        card28Cups06,
        card29Cups07,
        card30Cups08,
        card31Cups09,
        card32Cups10,
        card33CupsPage,
        card34CupsKnight,
        card35CupsQueen,
        card36CupsKing,
        // The Swords:
        card37Swords01,
        card38Swords02,
        card39Swords03,
        card40Swords04,
        card41Swords05,
        card42Swords06,
        card43Swords07,
        card44Sowrds08,
        card45Swords09,
        card46Swords10,
        card47SwordsPage,
        card48SwordsKnight,
        card49SwordsQueen,
        card50SwordsKing,
        // The Wands
        card51Wands01,
        card52Wands02,
        card53Wands03,
        card54Wands04,
        card55Wands05,
        card56Wands06,
        card57Wands07,
        card58Wands08,
        card59Wands09,
        card60Wands10,
        card61WandsPage,
        card62WandsKnight,
        card63WandsQueen,
        card64WandsKing,
        // The Pentacles ( Coins )
        card65Coins01,
        card66Coins02,
        card67Coins03,
        card68Coins04,
        card69Coins05,
        card70Coins06,
        card71Coins07,
        card72Coins08,
        card73Coins09,
        card74Coins10,
        card75CoinsPage,
        card76CoinsKnight,
        card77CoinsQueen,
        card78CoinsKing
    )


}