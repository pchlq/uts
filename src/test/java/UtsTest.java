import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class UtsTest {

    private final int[] n = new int[] {1, 3, 2, 9, 0, 4};
    private final Uts uts = new Uts(n);

    @ParameterizedTest(name = "changeArray({0}) should return {1}")
    @MethodSource("uts")
    void uts(int m, int[] result) {

        assertArrayEquals(uts.changeArray(n, m), result);
    }

    private static Stream<Arguments> uts() {

        return Stream.of(
                Arguments.of(1, new int[]{3, 2, 9, 0, 4, 1}),
                Arguments.of(2, new int[]{2, 9, 0, 4, 1, 3}),
                Arguments.of(3, new int[]{9, 0, 4, 1, 3, 2}),
                Arguments.of(4, new int[]{0, 4, 1, 3, 2, 9}),
                Arguments.of(5, new int[]{4, 1, 3, 2, 9, 0}),
                Arguments.of(6, new int[]{1, 3, 2, 9, 0, 4}),
                Arguments.of(100, new int[0]),
                Arguments.of(0, new int[0])
        );
    }

}