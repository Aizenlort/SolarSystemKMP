<H1>SolarSystemKMP</H1>

Explore the wonders of our solar system! Discover detailed information about each planet, from Mercury to Neptune

<p align="center">
  <img src="readme-images/banner/solar_system.png" height=200>
</p>

## Stack
- 🍎 Shared UI - [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform)
- 🚏 Navigation - [Androidx](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-navigation-routing.html#sample-project)
- 🏗 ViewModel - [Androidx](https://touchlab.co/kmp-viewmodel)
- 💉 Dependecy Injection - [Koin](https://github.com/InsertKoinIO/koin)
- 🛢 Image Loading - [Coil](https://github.com/coil-kt/coil)

---

<pre>
<h2 align="center">Домашнее задание №1</h2>
</pre>

### ✅ Выполненные задачи:
1. **Рефакторинг загрузки данных:** Добавлена универсальная `Result`-обёртка (`Success` / `Error`) в репозиторий. Реализовано корректное отображение состояния ошибки в UI с кнопкой повторной попытки.
2. **Локализация:** Созданы строковые ресурсы для русского (`values-ru`) и английского (`values`) языков с поддержкой динамического переключения интерфейса.
3. **Экран «О приложении»:** Создан отдельный экран с информацией о версии приложения (1.0.0) и разработчике, настроена навигация с главного экрана и обратно.
4. **CI/CD и качество кода:** Настроен GitHub Actions Workflow для автоматической сборки и запуска Unit-тестов, интегрирован статический анализатор кода **Detekt**.

<p align="center">
  <img src="readme-images/hw1/error_screen.png" height="400" alt="Экран ошибки">
  <img src="readme-images/hw1/about_screen.png" height="400" alt="Экран О приложении">
</p>
<p align="center">
  <em>Обработка ошибки и навигация</em>
</p>

<p align="center">
  <img src="readme-images/hw1/locale_ru.png" height="400" alt="Локализация RU">
</p>
<p align="center">
  <em>Поддержка русского и английского языков</em>
</p>

---

<pre>
<h2 align="center">Android</h2>
</pre>
<p align="center">
  <img src="readme-images/android/planets.png" height=600>
  <img src="readme-images/android/planet-detail.png" height=600>
</p>
<pre>  
<h2 align="center">IOS</h2>
</pre>
<p align="center">
  <img src="readme-images/ios/planets.png" height=600>
  <img src="readme-images/ios/planet-detail.png" height=600>
</p>
<pre> 
<h2 align="center">Desktop</h2>
</pre>
<p align="center">
  <img src="readme-images/desktop/planets.png">
  <img src="readme-images/desktop/planet-detail.png">
</p>
<pre> 
<h2 align="center">Web</h2>
</pre>
<p align="center">
  <img src="readme-images/web/planets.png">
  <img src="readme-images/web/planet-detail.png">
</p>
<pre>
<h2 align="center">Web Mobile</h2>
</pre>
<p align="center">
  <img src="readme-images/web-mobile/planets.png" height=600>
  <img src="readme-images/web-mobile/planet-detail.png" height=600>
</p>
