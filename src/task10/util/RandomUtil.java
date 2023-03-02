package task10.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static task10.util.Constants.*;

public class RandomUtil {

    public static int randomQuantity() {
        Random random = new Random();
        return random.nextInt(ONE, NINETY_NINE);
    }

    public static LocalDate randomDate() {
        LocalDate startDate = LocalDate.of(LocalDate.now().getYear() - ONE, ONE, ONE);
        LocalDate endDate = LocalDate.now();
        return startDate.plusDays(ThreadLocalRandom.current().nextLong(ChronoUnit.DAYS.between(startDate,
                endDate) + ONE));
    }

    public static String randomUuid() {
        UUID uuid = UUID.randomUUID();
        long uuidAsNumber = (uuid.getMostSignificantBits() << THIRTY_TWO) | (uuid.getLeastSignificantBits() & 0xFFFFFFFFL);
        String uuidAsString = Long.toString(uuidAsNumber);
        return uuidAsString.replaceAll("-", "").substring(ZERO, THIRTEEN);
    }

    public static float randomPrice() {
        Random random = new Random();
        return random.nextFloat(ZERO, NINE);
    }
}
