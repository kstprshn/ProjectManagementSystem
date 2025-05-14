<h1 align="center">📋 SmartTaskFlow – Kanban Project Management system</h1>

<h3>Описание проекта</h3>
<p>
SmartTaskFlow — это <strong>REST API</strong> для управления проектами по методологии <strong>Kanban</strong>, реализованный на <strong>Java</strong> с использованием <strong>Spring Boot</strong>. Приложение предназначено для командной работы и обеспечивает полный жизненный цикл управления задачами — от создания проектов до отслеживания выполнения и взаимодействия участников. 
</p>
<p>
Система обеспечивает защищённый доступ к API, <strong>JWT-аутентификацию</strong>, <strong>кеширование с Redis</strong>,а также <strong>документирование API через Swagger</strong>. Кроме того, в проекте используется мониторинг с <strong>Prometheus</strong>, логирование действий пользователя при помощи <strong>ELK-stack</strong> и контейнеризация с помощью <strong>Docker и Docker-compose</strong>. Дополнительно был разработан отдельный <strong>микросервис уведомлений</strong> Notification-Service, который принимает события (например, об истечении сроков выполнения задач) из основного приложения с помощью <strong>Apache Kafka</strong>.
</p>

<h2>🚀 Функциональность</h2>

<h3>🔐Пользователи и безопасность</h3>
<ul>
  <li>Регистрация и аутентификация через JWT</li>
  <li>OAuth2 вход через Google</li>
  <li>Шифрование паролей</li>
  <li>Ограничение доступа к эндпоинтам</li>
</ul>

<h3>📌Управление проектами (Kanban)</h3>
<ul>
  <li>Создание и редактирование досок</li>
  <li>Архивация/разархивация досок и задач</li>
  <li>Добавление участников в доску</li>
  <li>Управление панелями и задачами</li>
  <li>Работа с подзадачами</li>
  <li>Назначение задач пользователям</li>
  <li>Комментирование задач</li>
</ul>

<h3>📊Инфраструктура</h3>
<ul>
  <li>Swagger UI для документирования API</li>
  <li>Redis Cache (чёрный список JWT)</li>
  <li>Контейнеризация через Docker и Docker Compose</li>
  <li>Мониторинг и метрики: Prometheus + Grafana</li>
  <li>Логирование: ELK stack (Elasticsearch, Logstash, Kibana)</li>
  <li>Передача сообщений через Apache Kafka</li>
</ul>

<h2>🛠️ Стек технологий</h2>

<h4>Backend:</h4>
<ul>
  <li>Java 17</li>
  <li>Spring Boot</li>
  <li>Hibernate ORM</li>
  <li>PostgreSQL</li>
  <li>Redis</li>
  <li>REST API</li>
  <li>Maven</li>
</ul>

<h4>Безопасность:</h4>
<ul>
  <li>Spring Security</li>
  <li>JWT</li>
  <li>OAuth2 (Google)</li>
</ul>

<h4>Инфраструктура и DevOps:</h4>
<ul>
  <li>Docker, Docker Compose</li>
  <li>Apache Kafka</li>
  <li>Swagger/OpenAPI</li>
  <li>Prometheus + Grafana</li>
  <li>ELK Stack</li>
</ul>

<h4>Тестирование и инструменты:</h4>
<ul>
  <li>Postman</li>
  <li>IntelliJ IDEA</li>
  <li>Git / GitHub</li>
</ul>

<h2>📦 Развертывание</h2>
<ul>
  <li>Локальный запуск: <code>docker-compose up</code></li>
</ul>

<h2 align="center">Архитектура системы</h2>
<img src="https://github.com/kstprshn/ProjectManagementSystem/raw/main/system_sheme.png" alt="System Scheme" width="1050"/>
