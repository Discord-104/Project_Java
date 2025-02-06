# Slot Machine Game 🎰💸

Welcome to the **Slot Machine Game**! 🎉 This project simulates a simple slot machine game where you can spin the reels and try to win some coins! 🪙

## Features ✨

- **Spin the reels**: Click the "Start" button to spin the three reels.
- **Random values**: The reels show random numbers between 0 and 9.
- **Winning**: If all three reels match, you win! 🎉
- **Balance**: Start with a balance of €10, and try your luck! 💰
- **Multithreaded**: Threads are used for smooth gameplay and animations. 🚀

## Game Controls 🎮

- **Click "Start"**: To begin the game and spin the reels.
- **Balance**: Your balance is displayed at the top of the screen. Each spin costs €1. 💸
- **Winning**: If the three reels show the same number, you win €1! 💰

## How to Play 🕹️

1. Run the application.
2. Click the "Start" button to spin the reels.
3. Watch the reels spin and see if you win! 🏆
4. Your balance will be updated accordingly.

## Classes Overview 📚

- **App**: The main application that sets up the game window and starts the game loop.
- **MyPanel**: The panel that displays the game components like the button, reels, and balance.
- **Bottone**: A class that creates a button (like "Start") on the screen.
- **Rullo**: Represents a slot machine reel that generates random numbers.
- **Portafoglio**: Manages the player's balance, adding or subtracting money based on wins or losses.
- **ThreadGiocata**: A thread that manages the game logic for a single round of the slot machine.
- **ThraedRepaint**: A thread that constantly repaints the game window to update the graphics.
- **ThreadRullo**: Handles the spinning animation for each individual reel.

## Technologies Used 🛠️

- **Java**: The main programming language used for the game.
- **Swing**: Java's GUI library used for building the user interface.

## License 📝

This project is open-source and available under the MIT License. Feel free to fork, modify, and contribute! 🎉

## Enjoy the Game! 🎮💰

Good luck! 🍀 May the odds be in your favor! 🤑

This should give a clear overview of the project with some fun and engaging emojis!
