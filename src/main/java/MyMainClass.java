import com.github.javafaker.Faker;

import java.lang.reflect.Method;
import java.util.Locale;

public class MyMainClass
{
    static Faker javaFaker, javaFakerTR;

    public static void main(String[] args)
    {
        javaFaker = Faker.instance();
        javaFakerTR = Faker.instance(new Locale("tr-TR"));

        printJavaFaker();
    }

    static void printJavaFaker()
    {
        try {
            Method[] mainMethods = Faker.class.getMethods();

            for (Method mainMethod:mainMethods)
            {
                Class<?> mainMethodReturnType = mainMethod.getReturnType();

                Method[] childMethods = mainMethodReturnType.getMethods();

                for (Method childMethod:childMethods)
                {
                    try{

                        Class<?> classOfReturnType = Class.forName(mainMethodReturnType.getName());
                        Method method0 = classOfReturnType.getDeclaredMethod(childMethod.getName());

                        Object[] instances = getObjectByClaz(mainMethodReturnType.getName());

                        if (childMethod.getParameterCount() == 0)
                        {
                            System.out.println("Class: " + mainMethodReturnType.getSimpleName() +
                                    "\tmethod: " + childMethod.getName() + " \tvalueEN:  " +
                                    method0.invoke(instances[0]) + "\tvalueTR:  " + method0.invoke(instances[1]));

                            //System.out.println(method0.invoke(Faker.instance().number()));
                        }
                    }
                    catch (Exception e){
                        //e.printStackTrace();
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    private static Object[] getObjectByClaz(String claz){

        if (claz.equals("com.github.javafaker.Address")) return new Object[]{javaFaker.address(), javaFakerTR.address()};
        if (claz.equals("com.github.javafaker.Ancient")) return  new Object[]{javaFaker.ancient(), javaFakerTR.ancient()};
        if (claz.equals("com.github.javafaker.Animal")) return  new Object[]{javaFaker.animal(), javaFakerTR.animal()};
        if (claz.equals("com.github.javafaker.App")) return  new Object[]{javaFaker.app(), javaFakerTR.app()};
        if (claz.equals("com.github.javafaker.AquaTeenHunger")) return new Object[]{javaFaker.aquaTeenHungerForce(), javaFakerTR.aquaTeenHungerForce()};
        if (claz.equals("com.github.javafaker.Artist")) return  new Object[]{javaFaker.artist(), javaFakerTR.artist()};
        if (claz.equals("com.github.javafaker.Avatar")) return  new Object[]{javaFaker.avatar(), javaFakerTR.avatar()};
        if (claz.equals("com.github.javafaker.Aviation")) return  new Object[]{javaFaker.aviation(), javaFakerTR.aviation()};
        if (claz.equals("com.github.javafaker.BackToTheFuture")) return new Object[]{javaFaker.backToTheFuture(), javaFakerTR.backToTheFuture()};
        if (claz.equals("com.github.javafaker.Beer")) return  new Object[]{javaFaker.beer(), javaFakerTR.beer()};
        if (claz.equals("com.github.javafaker.Book")) return  new Object[]{javaFaker.book(), javaFakerTR.book()};
        if (claz.equals("com.github.javafaker.Bool")) return  new Object[]{javaFaker.bool(), javaFakerTR.bool()};
        if (claz.equals("com.github.javafaker.Buffy")) return  new Object[]{javaFaker.buffy(), javaFakerTR.buffy()};
        if (claz.equals("com.github.javafaker.Business")) return  new Object[]{javaFaker.business(), javaFakerTR.business()};
        if (claz.equals("com.github.javafaker.Cat")) return  new Object[]{javaFaker.cat(), javaFakerTR.cat()};
        if (claz.equals("com.github.javafaker.ChuckNorris")) return  new Object[]{javaFaker.chuckNorris(), javaFakerTR.chuckNorris()};
        if (claz.equals("com.github.javafaker.Code")) return  new Object[]{javaFaker.code(), javaFakerTR.code()};
        if (claz.equals("com.github.javafaker.Color")) return  new Object[]{javaFaker.color(), javaFakerTR.color()};
        if (claz.equals("com.github.javafaker.Commerce")) return  new Object[]{javaFaker.commerce(), javaFakerTR.commerce()};
        if (claz.equals("com.github.javafaker.Company")) return  new Object[]{javaFaker.company(), javaFakerTR.company()};
        if (claz.equals("com.github.javafaker.Country")) return  new Object[]{javaFaker.country(), javaFakerTR.country()};
        if (claz.equals("com.github.javafaker.Crypto")) return  new Object[]{javaFaker.crypto(), javaFakerTR.crypto()};
        if (claz.equals("com.github.javafaker.Currency")) return  new Object[]{javaFaker.currency(), javaFakerTR.currency()};
        if (claz.equals("com.github.javafaker.DateAndTime")) return  new Object[]{javaFaker.date(), javaFakerTR.date()};
        if (claz.equals("com.github.javafaker.Demographic")) return  new Object[]{javaFaker.demographic(), javaFakerTR.demographic()};
        if (claz.equals("com.github.javafaker.Dog")) return  new Object[]{javaFaker.dog(), javaFakerTR.dog()};
        if (claz.equals("com.github.javafaker.DragonBall")) return  new Object[]{javaFaker.dragonBall(), javaFakerTR.dragonBall()};
        if (claz.equals("com.github.javafaker.Dune")) return  new Object[]{javaFaker.dune(), javaFakerTR.dune()};
        if (claz.equals("com.github.javafaker.Educator")) return  new Object[]{javaFaker.educator(), javaFakerTR.educator()};
        if (claz.equals("com.github.javafaker.ElderScrolls")) return  new Object[]{javaFaker.elderScrolls(), javaFakerTR.elderScrolls()};
        if (claz.equals("com.github.javafaker.Esports")) return  new Object[]{javaFaker.esports(), javaFakerTR.esports()};
        if (claz.equals("com.github.javafaker.File")) return new Object[]{javaFaker.file(), javaFakerTR.file()};
        if (claz.equals("com.github.javafaker.Finance")) return new Object[]{javaFaker.finance(), javaFakerTR.finance()};
        if (claz.equals("com.github.javafaker.Food")) return new Object[]{javaFaker.food(), javaFakerTR.food()};
        if (claz.equals("com.github.javafaker.Friends")) return new Object[]{javaFaker.friends(), javaFakerTR.friends()};
        if (claz.equals("com.github.javafaker.funnyName")) return new Object[]{javaFaker.funnyName(), javaFakerTR.funnyName()};
        if (claz.equals("com.github.javafaker.GameOfThrones")) return  new Object[]{javaFaker.gameOfThrones(), javaFakerTR.gameOfThrones()};
        if (claz.equals("com.github.javafaker.Hacker")) return  new Object[]{javaFaker.hacker(), javaFakerTR.hacker()};
        if (claz.equals("com.github.javafaker.HarryPotter")) return  new Object[]{javaFaker.harryPotter(), javaFakerTR.harryPotter()};
        if (claz.equals("com.github.javafaker.Hipster")) return  new Object[]{javaFaker.hipster(), javaFakerTR.hipster()};
        if (claz.equals("com.github.javafaker.HitchhikersGuideToTheGalaxy")) return  new Object[]{javaFaker.hitchhikersGuideToTheGalaxy(), javaFakerTR.hitchhikersGuideToTheGalaxy()};
        if (claz.equals("com.github.javafaker.Hobbit")) return  new Object[]{javaFaker.hobbit(), javaFakerTR.hobbit()};
        if (claz.equals("com.github.javafaker.HowIMetYourMother")) return  new Object[]{javaFaker.howIMetYourMother(), javaFakerTR.howIMetYourMother()};
        if (claz.equals("com.github.javafaker.IdNumber")) return  new Object[]{javaFaker.idNumber(), javaFakerTR.idNumber()};
        if (claz.equals("com.github.javafaker.Internet")) return  new Object[]{javaFaker.internet(), javaFakerTR.internet()};
        if (claz.equals("com.github.javafaker.Job")) return  new Object[]{javaFaker.job(), javaFakerTR.job()};
        if (claz.equals("com.github.javafaker.LeagueOfLegends")) return  new Object[]{javaFaker.leagueOfLegends(), javaFakerTR.leagueOfLegends()};
        if (claz.equals("com.github.javafaker.Lebowski")) return  new Object[]{javaFaker.lebowski(), javaFakerTR.lebowski()};
        if (claz.equals("com.github.javafaker.LordOfTheRings")) return  new Object[]{javaFaker.lordOfTheRings(), javaFakerTR.lordOfTheRings()};
        if (claz.equals("com.github.javafaker.Lorem")) return  new Object[]{javaFaker.lorem(), javaFakerTR.lorem()};
        if (claz.equals("com.github.javafaker.Matz")) return  new Object[]{javaFaker.matz(), javaFakerTR.matz()};
        if (claz.equals("com.github.javafaker.Medical")) return  new Object[]{javaFaker.medical(), javaFakerTR.medical()};
        if (claz.equals("com.github.javafaker.Music")) return  new Object[]{javaFaker.music(), javaFakerTR.music()};
        if (claz.equals("com.github.javafaker.Name")) return  new Object[]{javaFaker.name(), javaFakerTR.name()};
        if (claz.equals("com.github.javafaker.Nation")) return  new Object[]{javaFaker.nation(), javaFakerTR.nation()};
        if (claz.equals("com.github.javafaker.Number")) return  new Object[]{javaFaker.number(), javaFakerTR.number()};
        if (claz.equals("com.github.javafaker.Options")) return  new Object[]{javaFaker.options(), javaFakerTR.options()};
        if (claz.equals("com.github.javafaker.Overwatch")) return  new Object[]{javaFaker.overwatch(), javaFakerTR.overwatch()};
        if (claz.equals("com.github.javafaker.PhoneNumber")) return  new Object[]{javaFaker.phoneNumber(), javaFakerTR.phoneNumber()};
        if (claz.equals("com.github.javafaker.Pokemon")) return  new Object[]{javaFaker.pokemon(), javaFakerTR.pokemon()};
        if (claz.equals("com.github.javafaker.PrincessBride")) return  new Object[]{javaFaker.princessBride(), javaFakerTR.princessBride()};
        if (claz.equals("com.github.javafaker.ProgrammingLanguage")) return  new Object[]{javaFaker.programmingLanguage(), javaFakerTR.programmingLanguage()};
        if (claz.equals("com.github.javafaker.Relationships")) return  new Object[]{javaFaker.relationships(), javaFakerTR.relationships()};
        if (claz.equals("com.github.javafaker.RickAndMorty")) return  new Object[]{javaFaker.rickAndMorty(), javaFakerTR.rickAndMorty()};
        if (claz.equals("com.github.javafaker.Robin")) return  new Object[]{javaFaker.robin(), javaFakerTR.robin()};
        if (claz.equals("com.github.javafaker.RockBand")) return  new Object[]{javaFaker.rockBand(), javaFakerTR.rockBand()};
        if (claz.equals("com.github.javafaker.Shakespeare")) return  new Object[]{javaFaker.shakespeare(), javaFakerTR.shakespeare()};
        if (claz.equals("com.github.javafaker.SlackEmoji")) return  new Object[]{javaFaker.slackEmoji(), javaFakerTR.slackEmoji()};
        if (claz.equals("com.github.javafaker.Space")) return  new Object[]{javaFaker.space(), javaFakerTR.space()};
        if (claz.equals("com.github.javafaker.StarTrek")) return  new Object[]{javaFaker.starTrek(), javaFakerTR.starTrek()};
        if (claz.equals("com.github.javafaker.Stock")) return  new Object[]{javaFaker.stock(), javaFakerTR.stock()};
        if (claz.equals("com.github.javafaker.Superhero")) return  new Object[]{javaFaker.superhero(), javaFakerTR.superhero()};
        if (claz.equals("com.github.javafaker.Team")) return  new Object[]{javaFaker.team(), javaFakerTR.team()};
        if (claz.equals("com.github.javafaker.TwinPeaks")) return  new Object[]{javaFaker.twinPeaks(), javaFakerTR.twinPeaks()};
        if (claz.equals("com.github.javafaker.University")) return  new Object[]{javaFaker.university(), javaFakerTR.university()};
        if (claz.equals("com.github.javafaker.Weather")) return  new Object[]{javaFaker.weather(), javaFakerTR.weather()};
        if (claz.equals("com.github.javafaker.Witcher")) return  new Object[]{javaFaker.witcher(), javaFakerTR.witcher()};
        if (claz.equals("com.github.javafaker.Yoda")) return  new Object[]{javaFaker.yoda(), javaFakerTR.yoda()};
        if (claz.equals("com.github.javafaker.Zelda")) return  new Object[]{javaFaker.zelda(), javaFakerTR.zelda()};

        else return null;

    }

}
