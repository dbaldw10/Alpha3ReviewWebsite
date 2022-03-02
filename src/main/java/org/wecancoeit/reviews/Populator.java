package org.wecancoeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.Hashtag;
import org.wecancoeit.reviews.entities.Manufacturer;
import org.wecancoeit.reviews.entities.Console;
import org.wecancoeit.reviews.repos.ConsoleRepository;
import org.wecancoeit.reviews.repos.HashtagRepository;
import org.wecancoeit.reviews.repos.ManufacturerRepository;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    ConsoleRepository consoleRepo;
    @Autowired
    ManufacturerRepository manufacturerRepo;
    @Autowired
    HashtagRepository hashtagRepo;

    @Override
    public void run(String... args) throws Exception {
        Console console1 = new Console("Sega Genesis", "Sega", "08/14/1989", "Console","The Sega Genesis, known as the Mega Drive outside North America, is a 16-bit fourth-generation home video game console developed and sold by Sega. The Genesis was Sega's third console and the successor to the Master System.", "/Images/sega.png");
        consoleRepo.save(console1);
        Console console2 = new Console("Nintendo Gameboy", "Nintendo", "1989", "Handheld", "Nintendo's second handheld game console, the Game Boy, combines features from both the NES home system and Game & Watch hardware. The console features a dot-matrix screen with adjustable contrast dial.", "/Images/gameboy.png");
        consoleRepo.save(console2);
        Console console3 = new Console("Nintendo SNES", "Nintendo", "11/21/1990", "Console", "The Super NES is Nintendo's second programmable home console, following the Nintendo Entertainment System (NES). The console introduced advanced graphics and sound capabilities compared with other systems at the time.", "/Images/SNES.png");
        consoleRepo.save(console3);
        Console console4 = new Console("Sega Gamegear", "Sega", "10/6/1990", "Handheld", "The Game Gear primarily competed with Nintendo's Game Boy, the Atari Lynx, and NEC's TurboExpress. It shares much of its hardware with the Master System, and can play Master System games by the use of an adapter.", "/Images/gamegear.png");
        consoleRepo.save(console4);
        Console console5 = new Console("Playstation (1)", "Sony", "9/16/1995", "Console", "The original PlayStation was the first of the ubiquitous PlayStation series of console and hand-held game devices. It was part of the fifth generation of video game consoles competing against the Sega Saturn and the Nintendo 64.", "/Images/ps1.png");
        consoleRepo.save(console5);
        Console console6 = new Console("Sega Dreamcast", "Sega", "11/27/1998", "Console", "The Dreamcast was the first in the sixth generation of video game consoles, preceding Sony's PlayStation 2, Nintendo's GameCube, and Microsoft's Xbox. The Dreamcast was Sega's final home console.", "/Images/dreamcast.png");
        consoleRepo.save(console6);
        Console console7 = new Console("Playstation 2", "Sony", "3/4/2000", "Console", "The PlayStation 2 (PS2) is a home video game console developed and marketed by Sony Computer Entertainment. It is the successor to the original PlayStation, as well as the second installment in the PlayStation brand of consoles.", "/Images/ps2.png");
        consoleRepo.save(console7);
        Console console8 = new Console("Xbox (First gen)", "Microsoft", "11/15/2001", "Console", "The original Xbox was Microsoft's first foray into the gaming console market. As part of the sixth generation of video game consoles, the Xbox competed with Sony's PlayStation 2, Sega's Dreamcast, and Nintendo's GameCube.", "/Images/xbox.png");
        consoleRepo.save(console8);
        Console console9 = new Console("Nintendo DS", "Nintendo", "11/21/2004", "Handheld", "The DS, an initialism for \"Developers' System\" or \"Dual Screen\", introduced distinctive new features to handheld games: two LCD screens working in tandem (the bottom one being a touchscreen), a built-in microphone and support for wireless connectivity.", "/Images/Nintendo ds.png");
        consoleRepo.save(console9);
        Console console10 = new Console("Xbox 360", "Microsoft", "11/21/2005", "Console","The Xbox One was released on November 22, 2013, in North America, as the successor to the Xbox 360. The Xbox One competed with Sony's PlayStation 4 and Nintendo's Wii U and Switch as part of the eighth generation of video game consoles.", "/Images/xbox360.png");
        consoleRepo.save(console10);
        Console console11 = new Console("Playstation 3", "Sony", "11/11/2006", "Console", "The PlayStation 3 (PS3) is a home video game console developed by Sony Computer Entertainment. The successor to PlayStation 2, it is part of the PlayStation brand of consoles.", "/Images/ps3.png");
        consoleRepo.save(console11);
        Console console12 = new Console("Nintendo Wii", "Nintendo", "11/19/2006", "Console", "The Wii is a home video game console developed and marketed by Nintendo.It is Nintendo's fifth major home game console, following the GameCube and is a seventh generation home console alongside Microsoft's Xbox 360 and Sony's PlayStation 3.", "/Images/wii.png");
        consoleRepo.save(console12);
        Console console13 = new Console("PS Vita", "Sony", "12/17/2011", "Handheld", "The PlayStation Vita (PS Vita, or Vita) is a handheld video game console developed and marketed by Sony Interactive Entertainment. The console is the successor to the PlayStation Portable.", "/Images/psvita.png");
        consoleRepo.save(console13);
        Console console14 = new Console("Playstation 4", "Sony", "11/15/2013", "Console", "The PlayStation 4 (PS4) is a home video game console developed by Sony Computer Entertainment. A console of the eighth generation, it competes with Microsoft's Xbox One and Nintendo's Wii U and Switch.", "/Images/ps4 console.png");
        consoleRepo.save(console14);
        Console console15 = new Console("Xbox One", "Microsoft", "11/22/2013", "Console", "The Xbox One is a line of home video game consoles developed by Microsoft. It is the successor to Xbox 360 and the third base console in the Xbox series of video game consoles. It is the first Xbox game console to be released in China.", "/Images/xbox1.png");
        consoleRepo.save(console15);
        Console console16 = new Console("Nintendo Switch", "Nintendo", "3/3/2017", "Handheld", "The Nintendo Switch is a tablet that can either be docked for use as a home console or used as a portable device, making it a hybrid console. Its wireless Joy-Con controllers, with standard buttons and directional analog sticks, along with motion sensors.", "/Images/switch.png");
        consoleRepo.save(console16);
        Console console17 = new Console("Xbox Series X", "Microsoft", "11/10/2020", "Console", "The Xbox Series X is a home video game consoles developed by Microsoft. Along with Sony's PlayStation 5, also released in November 2020, the Xbox Series X is part of the ninth generation of video game consoles.", "/Images/xbox series x.png");
        consoleRepo.save(console17);
        Console console18 = new Console("Playstation 5", "Sony", "11/10/2020", "Console", "The PlayStation 5 (PS5) is a home video game console developed by Sony Interactive Entertainment. It is part of the ninth generation of video game consoles, along with Microsoft's Xbox Series X and Series S consoles, which were released in the same month.", "/Images/ps5.png");
        consoleRepo.save(console18);

        Manufacturer manufacturer1 = new Manufacturer("Microsoft", console8, console9, console14, console16);
        manufacturerRepo.save(manufacturer1);
        Manufacturer manufacturer2 = new Manufacturer("Sony", console5, console7, console11, console13, console14, console18);
        manufacturerRepo.save(manufacturer2);
        Manufacturer manufacturer3 = new Manufacturer("Nintendo", console2, console3, console9, console12, console16);
        manufacturerRepo.save(manufacturer3);
        Manufacturer manufacturer4 = new Manufacturer("Sega", console1, console4, console6);
        manufacturerRepo.save(manufacturer4);

//        Hashtag hashtag1 = new Hashtag("#FamilyFun", console1, console4, console14);
//        hashtagRepo.save(hashtag1);
//        hashtag1.addConsole(console1);
//        hashtag1.addConsole(console4);
//        hashtag1.addConsole(console14);
    }
}