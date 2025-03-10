import Logo from "../../assets/img/logo.svg";
import "./styles.css";

function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={Logo} alt="DSMeta" />
        <h1>DSMeta</h1>
        <p>
          Desenvolvido por
          <a href="https://www.linkedin.com/in/lara-matos-aguirres-3a632b244/"> Lara Matos Aguirres</a>
        </p>
      </div>
    </header>
  );
}

export default Header;
