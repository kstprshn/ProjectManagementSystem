<h1 align="center">🚀 SmartTaskFlow – Kanban Project Management system</h1>

<h3>📘 Описание проекта</h3>
<p>
SmartTaskFlow — это <strong>REST API</strong> для управления проектами по методологии <strong>Kanban</strong>, реализованный на <strong>Java</strong> с использованием <strong>Spring Boot</strong>. Приложение предоставляет функциональность для работы с досками, задачами, подзадачами, участниками и комментариями. 
</p>
<p>
Система включает в себя <strong>JWT-аутентификацию</strong>, <strong>OAuth2 через Google</strong>, защиту эндпоинтов, <strong>кеширование с Redis</strong>, и <strong>документирование API через Swagger</strong>. Для мониторинга применены <strong>Prometheus</strong> и <strong>Grafana</strong>. В состав решения входит <strong>отдельный микросервис уведомлений</strong>, который принимает события (например, об истечении сроков задач и назначении пользователей) из основного приложения через <strong>Apache Kafka</strong>. Пока микросервис реализует логирование этих событий, но готов к расширению.
</p>

<h2>🎯 Функциональность</h2>

<h3>🔐 Безопасность и пользователи</h3>
<ul>
  <li>Регистрация и вход через JWT</li>
  <li>OAuth2 вход через Google</li>
  <li>Шифрование паролей (bcrypt)</li>
  <li>Ограничение доступа к эндпоинтам</li>
</ul>

<h3>📌 Управление проектами (Kanban)</h3>
<ul>
  <li>Создание и редактирование досок</li>
  <li>Архивация/разархивация досок</li>
  <li>Добавление участников в доску</li>
  <li>Управление панелями и задачами</li>
  <li>Работа с подзадачами</li>
  <li>Назначение задач пользователям</li>
  <li>Комментирование задач</li>
</ul>

<h3>📈 Инфраструктура и расширения</h3>
<ul>
  <li>Swagger UI для тестирования API</li>
  <li>Redis Cache (для ускорения запросов и чёрных списков JWT)</li>
  <li>Контейнеризация через Docker и Docker Compose</li>
  <li>Мониторинг и метрики: Prometheus + Grafana</li>
  <li>Логирование: ELK stack (Elasticsearch, Logstash, Kibana)</li>
  <li>Микросервис уведомлений через Apache Kafka</li>
</ul>

<h2>🛠️ Стек технологий</h2>

<h4>Backend:</h4>
<ul>
  <li>Java 17</li>
  <li>Spring Boot (Web, Security, JPA, Validation)</li>
  <li>Hibernate ORM</li>
  <li>PostgreSQL</li>
  <li>REST API</li>
  <li>Redis</li>
  <li>Maven</li>
</ul>

<h4>Security:</h4>
<ul>
  <li>Spring Security</li>
  <li>JWT</li>
  <li>OAuth2 (Google)</li>
</ul>

<h4>Инфраструктура и DevOps:</h4>
<ul>
  <li>Docker + Docker Compose</li>
  <li>Apache Kafka</li>
  <li>Swagger/OpenAPI</li>
  <li>Prometheus + Grafana</li>
  <li>ELK Stack</li>
</ul>

<h4>Тестирование и инструменты:</h4>
<ul>
  <li>JUnit</li>
  <li>Postman</li>
  <li>IntelliJ IDEA</li>
  <li>Git / GitHub</li>
</ul>

<h2>📦 Развертывание</h2>
<ul>
  <li>Локальный запуск: <code>docker-compose up</code></li>
  <li>Поддержка конфигураций для продакшена</li>
</ul>
