CREATE TABLE `shipwreck` (
  `id`              INT          NOT NULL AUTO_INCREMENT,
  `name`            VARCHAR(255) NOT NULL,
  `description`     VARCHAR(255) NOT NULL,
  `condition`       VARCHAR(255) NOT NULL,
  `depth`           INT          NOT NULL,
  `longitude`       DOUBLE       NOT NULL,
  `latitude`        DOUBLE       NOT NULL,
  `year_discovered` INT          NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB;