import java.util.Scanner;

public class Nokia5510 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                				MENU
                
                			1. PhoneBook
                			2. Messages
                			3. Chat
                			4. Call Register
                			5. Tones
                			6. Settings
                			7. Call divert
                			8. Music
                			9. Games
                			10. Calculator
                			11. Reminders
                			12. Clock
                			13. Profiles
                			14. Services
                			15. SIM services
                """);
        System.out.println("Kindly Enter your options ");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {


                System.out.print("""
                        
                        			PHONEBOOK
                        
                        			1. Search
                        			2. Service Nos.
                        			3. Add name
                        			4. Erase
                        			5. Edit
                        			6. Copy
                        			7. Assign tone
                        			8. Send b'card 
                        			9. Options
                        			10. Speed dials
                        			11. Voice tags
                        
                        """);

                System.out.print("Enter option: ");
                int options = scanner.nextInt();

                switch (options) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service nos");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Copy");
                    case 7 -> System.out.println("Assign tone");
                    case 8 -> System.out.println("Send b'card");
                    case 9 -> {
                        System.out.println("Options");
                        System.out.print(""" 
                                
                                				OPTIONS
                                
                                				1. Memory in use
                                				2. Type of view
                                				3. Memory status
                                
                                """);
                        System.out.print("Enter Option: ");
                        int option1 = scanner.nextInt();

                        switch (option1) {
                            case 1 -> System.out.println("Memory in use");
                            case 2 -> System.out.println("Type of view");
                            case 3 -> System.out.println("Memory status");
                        }
                    }
                    case 10 -> System.out.println("Speed dials");
                    case 11 -> System.out.println("Voice tags");
                }
            }
                case 2 -> {

                    System.out.print("""
                            
                            			MESSAGES
                            
                            			1. Write messages
                            			2. Inbox
                            			3. Outbox
                            			4. Picture messages
                            			5. Templates
                            			6. Smileys
                            			7. Message settings
                            			8. Info service 
                            			9. Voice mailbox number
                            			10. Service command editor
                            
                            """);

                    System.out.print("Enter Option: ");
                    int optionMessage1 = scanner.nextInt();

                    switch (optionMessage1) {
                        case 1 -> System.out.println("Write message");
                        case 2 -> System.out.println("Inbox");
                        case 3 -> System.out.println("Outbox");
                        case 4 -> System.out.println("Picture messages");
                        case 5 -> System.out.println("Templates");
                        case 6 -> System.out.println("Smileys");
                        case 7 -> {

                            System.out.println("Message settings");

                            System.out.print(""" 
                                    
                                    				OPTIONS
                                    
                                    				1. Set 1
                                    				2. Common
                                    
                                    """);
                            System.out.print("Enter Option: ");
                            int optionMessage2 = scanner.nextInt();

                            switch (optionMessage2) {
                                case 1 -> {
                                    System.out.println("Set 1");
                                    System.out.print(""" 
                                            
                                            				SET 1
                                            
                                            				1. Message centre number
                                            				2. Message sent as
                                            				3. Message validity
                                            
                                            """);
                                    System.out.print("Enter Option: ");
                                    int optionMessage3 = scanner.nextInt();

                                    switch (optionMessage3) {
                                        case 1 -> System.out.println("Message centre number");
                                        case 2 -> System.out.println("Message sent as");
                                        case 3 -> System.out.println("Message validity");


                                    }
                                }
                                case 2 -> {
                                    System.out.println("Common");
                                    System.out.print(""" 
                                            
                                            				COMMON
                                            
                                            				1. Delivery reports
                                            				2. Reply via same centre
                                            				3. Character support
                                            
                                            """);
                                    System.out.print("Enter Option: ");
                                    int optionMessage4 = scanner.nextInt();
                                    switch (optionMessage4) {
                                        case 1 -> System.out.println("Delivery reports");
                                        case 2 -> System.out.println("Reply via same centre");
                                        case 3 -> System.out.println("Character support");
                        case 8 -> System.out.println("Info service");
                        case 9 -> System.out.println("Voice mailbox number");
                        case 10 -> System.out.println("Service command editor");


                                    }
                                }

                            }


                        }
                    }




                }
                    case 3->{
                        System.out.println("Chat");

                    }
                    case 4-> {
                    System.out.print("""
                                     Call register
                            
                            			1. Missed calls
                             			2. Received calls
                            			3. Dialled numbers
                            			4. Erase recent call lists
                            			5. Show call duration
                            			6. Show call costs
                            			7. Call settings
                            			8. Prepaid credit 
                            
                            """);
                            System.out.print("Enter option: ");
                            int optionCall = scanner.nextInt();

                            switch (optionCall){
                                case 1 -> System.out.println("Missed calls");
                                case 2 -> System.out.println("Received calls");
                                case 3 -> System.out.println("Dialled numbers");
                                case 4 -> System.out.println("Erase recent call lists");
                                case 5 -> {
                                    System.out.println("Show call duration");
                                    System.out.print("""
                                            SHOW CALL DURATION
                                            
                                            1. Last call duration
                                            2. All calls duration
                                            3. Received calls duration
                                            4. Dialled calls duration
                                            5. Clear timers
                                            
                                            """);
                                    System.out.print("Enter option: ");
                                    int optionShowCall = scanner.nextInt();

                                    switch (optionShowCall){
                                        case 1 -> System.out.println("Last call duration");
                                        case 2 -> System.out.println("All calls duration");
                                        case 3 -> System.out.println("Received calls duration");
                                        case 4 -> System.out.println("Dialled calls duration");
                                        case 5 -> System.out.println("Clear timers");
                                    }
                                }
                                case 6 -> {
                                    System.out.print("Show call costs");
                                    System.out.print("""
                                            SHOW CALL COSTS
                                            
                                            1. Last call cost
                                            2. All calls cost
                                            3. Clear counters
                                        
                                            """);
                                    System.out.print("Enter option: ");
                                    int optionShowCost = scanner.nextInt();

                                    switch (optionShowCost){
                                        case 1 -> System.out.println("Last call cost");
                                        case 2 -> System.out.println("Last call cost");
                                        case 3 -> System.out.println("Clear counters");
                                    }
                                }
                                case 7 -> {
                                    System.out.print("Call settings");
                                    System.out.print("""
                                            CALL SETTINGS
                                            
                                            1. Call cost limit 
                                            2. Show costs in
                                        
                                            """);
                                    System.out.print("Enter option: ");
                                    int optionShowSettings = scanner.nextInt();

                                    switch (optionShowSettings){
                                        case 1 -> System.out.println("Call cost limit");
                                        case 2 -> System.out.println("Show costs in3");
                                    }
                                }
                                case 8 -> System.out.print("Prepaid credit");

                            }
                    }
                case 5 ->{
                    System.out.print("""
                                     Tones
                            
                            			1. Ringing tone
                             			2. Ringing volume
                            			3. Incoming call alert
                            			4. Message alert tone
                            			5. Keypad tones
                            			6. Warning tones
                            			7. Vibrating alert
                            			8. Screen saver
                            
                            """);
                    System.out.print("Enter option: ");
                    int optionTones = scanner.nextInt();

                    switch (optionTones){
                        case 1 -> System.out.println("Ringing tone");
                        case 2 -> System.out.println("Ringing volume");
                        case 3 -> System.out.println("Incoming call alert");
                        case 4 -> System.out.println("Message alert tone");
                        case 5 -> System.out.println("Keypad tones");
                        case 6 -> System.out.println("Warning tones");
                        case 7 -> System.out.println("Vibrating alert");
                        case 8 -> System.out.println("Screen saver");

                    }
                }
            case 6 ->{
                System.out.print("""
                                     Settings
                            
                            			1. Call settings
                             			2. Phone settings
                            			3. Security settings
                            			4. Restore factory settings
                            
                            """);
                System.out.print("Enter option: ");
                int optionSettings = scanner.nextInt();

                switch (optionSettings){
                    case 1 -> {
                        System.out.println("Call settings");
                        System.out.print("""
                                     
                            			1. Automatic redial
                             			2. Speed dialling 
                            			3. Call waiting options
                            			4. Own number sending
                            			5. Phone line in use
                            			6. Automatic answer
                            """);
                        System.out.print("Enter option: ");
                        int callSettings = scanner.nextInt();

                        switch (callSettings){
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dialling");
                            case 3 -> System.out.println("Call waiting options");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer");
                        }
                    }
                    case 2 -> {
                        System.out.println("Phone settings");
                        System.out.print("""
                                     
                            			1. Language
                             			2. Cell info display 
                            			3. Welcome note
                            			4. Network selection
                            			5. Confirm SIM service actions
                            """);
                        System.out.print("Enter option: ");
                        int phoneSettings = scanner.nextInt();

                        switch (phoneSettings){
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Cell info display ");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Confirm SIM service actions");
                        }
                    }
                    case 3 -> {
                        System.out.println("Security settings");
                        System.out.print("""
                                     
                            			1. PIN code request
                             			2. Call barring service 
                            			3. Fixed dialling
                            			4. Closed user group
                            			5. Security level
                            			6. Change access codes
                            """);
                        System.out.print("Enter option: ");
                        int securitySettings = scanner.nextInt();

                        switch (securitySettings){
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring service");
                            case 3 -> System.out.println("Fixed dialling");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Security level");
                            case 6 -> System.out.println("Change access codes");

                        }
                    }
                    case 4 -> System.out.println("Restore factory settings");
                }
            }
        case 7 ->{
            System.out.println("Call Divert");

        }
        case 8 ->{
            System.out.print("""
                                     Music
                            
                            			1. Music player
                             			2. Radio
                            			3. Recorder
                            			4. Track list
                            
                            """);
            System.out.print("Enter option: ");
            int optionMusic = scanner.nextInt();

            switch (optionMusic){
                case 1 -> System.out.println("Music player");
                case 2 -> System.out.println("Radio");
                case 3 -> System.out.println("Recorder");
                case 4 -> System.out.println("Track list");
            }
        }
        case 9 ->{
            System.out.println("Games");

        }
        case 10 ->{
            System.out.println("Calculator");

        }
        case 11 ->{
            System.out.println("Reminder");

        }
        case 12 ->{
            System.out.print("""
                                     Clock
                            
                            			1. Alarm clock
                             			2. Clock settings
                            			3. Date setting
                            			4. Stopwatch
                            			5. Countdown timer
                            			6. Auto update of date and time
                            
                            """);
            System.out.print("Enter option: ");
            int optionClock = scanner.nextInt();

            switch (optionClock){
                case 1 -> System.out.println("Alarm clock");
                case 2 -> System.out.println("Clock settings");
                case 3 -> System.out.println("Date setting");
                case 4 -> System.out.println("Stopwatch");
                case 5 -> System.out.println("Countdown timer");
                case 6 -> System.out.println("Auto update of date and time");
            }
        }
        case 13 ->{
            System.out.println("Profiles");

        }
        case 14 ->{
            System.out.println("Service");

        }
        case 15 ->{
            System.out.println("SIM services");

        }
        }
    }
}







