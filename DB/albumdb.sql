-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema albumdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `albumdb` ;

-- -----------------------------------------------------
-- Schema albumdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `albumdb` DEFAULT CHARACTER SET utf8 ;
USE `albumdb` ;

-- -----------------------------------------------------
-- Table `album`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `album` ;

CREATE TABLE IF NOT EXISTS `album` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `artist` VARCHAR(80) NOT NULL,
  `release_year` INT NULL,
  `genre` VARCHAR(60) NULL,
  `image_url` VARCHAR(2000) NULL,
  `sale_price` DECIMAL(4,2) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS albumuser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'albumuser'@'localhost' IDENTIFIED BY 'albumuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'albumuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `album`
-- -----------------------------------------------------
START TRANSACTION;
USE `albumdb`;
INSERT INTO `album` (`id`, `name`, `artist`, `release_year`, `genre`, `image_url`, `sale_price`) VALUES (1, 'Good Luck, Babe!', 'Chappell Roan', 2024, 'pop', 'https://neonmusic.online/wp-content/uploads/2024/04/444-4-2.jpg', NULL);
INSERT INTO `album` (`id`, `name`, `artist`, `release_year`, `genre`, `image_url`, `sale_price`) VALUES (2, 'The Dark Side of the Moon', 'Pink Floyd', 1973, 'rock', 'https://upload.wikimedia.org/wikipedia/en/3/3b/Dark_Side_of_the_Moon.png', NULL);
INSERT INTO `album` (`id`, `name`, `artist`, `release_year`, `genre`, `image_url`, `sale_price`) VALUES (3, 'Exile on Main St.', 'Rolling Stones', 1972, 'rock', 'https://cdn.mos.cms.futurecdn.net/8041652ce0d88b422f93f817b8565721-320-80.jpg', NULL);
INSERT INTO `album` (`id`, `name`, `artist`, `release_year`, `genre`, `image_url`, `sale_price`) VALUES (4, 'Abbey Road', 'The Beatles', 1969, 'rock', 'https://i.ytimg.com/vi/oolpPmuK2I8/hq720.jpg?sqp=-oaymwEXCK4FEIIDSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLCUji5QWCqb4EE122GoJATEbU5QHQ', NULL);
INSERT INTO `album` (`id`, `name`, `artist`, `release_year`, `genre`, `image_url`, `sale_price`) VALUES (5, 'What\'s Going On', 'Marvin Gaye', 1971, 'soul', 'https://i.guim.co.uk/img/media/1396fd6784072c858e39afabb23d1518f158b774/0_93_1453_871/master/1453.jpg?width=1200&quality=85&auto=format&fit=max&s=79731e14855c3e2ce647773b288c8514', NULL);

COMMIT;

