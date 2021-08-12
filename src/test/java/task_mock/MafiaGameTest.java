package task_mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import task_mock.models.Bandit;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

class MafiaGameTest {
    MafiaGame mafia;

    @BeforeEach
    void init() {
    }

    @Test
    void test_captureOfABandit() {
        //Given
        List<task_mock.models.Character> expectedCharacters = Arrays.asList(
                new Bandit("NoName", 45, "killer"),
                new Bandit("Roman", 33, "thief")
        );
        mafia = Mockito.mock(MafiaGame.class);
        when(mafia.captureOfABandit(anyList())).thenReturn(expectedCharacters);

        //When
        List<task_mock.models.Character> actualCharacters;
        actualCharacters = mafia.captureOfABandit(expectedCharacters);

        //Then
        assertEquals(expectedCharacters, actualCharacters);
    }
}

