# Stock-Market

MyApp is an Android application designed to fetch data from an API using Retrofit, store it locally with Room database, and parse data from CSV format. The app follows a clean architecture pattern and utilizes Jetpack Compose for UI rendering and data visualization with good charts.

## Features

- Fetch data from API using Retrofit.
- Store data locally with Room database.
- Parse data from CSV format.
- Follows Clean Architecture principles.
- Utilizes Jetpack Compose for UI.
- Presents data with good charts for visualization.

## Architecture

The app follows the principles of Clean Architecture to achieve separation of concerns and maintainability. It consists of the following layers:

- **Presentation Layer**: Responsible for UI rendering and user interaction. It uses Jetpack Compose for building UI components and good charts for data visualization.

- **Domain Layer**: Contains business logic and use cases. It defines the operations that can be performed on data.

- **Data Layer**: Manages data from different sources (API, database, etc.). It consists of repositories responsible for fetching data from the API and storing it locally with Room database. It also includes CSV parsing functionality.

## Libraries Used

- Retrofit: For making API calls.
- Room: For local database storage.
- Jetpack Compose: For UI development.
- Good Charts: For data visualization.
- CSV Parser Library: For parsing CSV data.

## Setup

To run the app, follow these steps:

1. Clone this repository.
2. Open the project in Android Studio.
3. Build and run the app on an Android device or emulator.

## Usage

Once the app is running, you can:

- View data fetched from the API.
- Store data locally with Room database.
- Parse data from CSV format.
- Visualize data with good charts.

## Screen for chart
![WhatsApp Image 2024-03-25 at 00 15 20_17e19872](https://github.com/Tonistark92/Stock-Market/assets/86676102/06ee0043-a22d-4b14-89fe-0c6653e7a32a)


## Contributing

Contributions are welcome! If you'd like to contribute to this project, feel free to fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
