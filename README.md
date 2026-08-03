# OpenPMO Public Identity Check Interface

Contrato Java independente de provedor para localizar e validar identidades que podem receber permissões no OpenPMO.

## Responsabilidades

- Consultar uma identidade por CPF.
- Pesquisar agentes públicos por nome.
- Consultar um agente público pelo `sub`.
- Representar cidadão, agente público, papéis, vínculos e órgãos sem depender do GOVES.
- Diferenciar identidade encontrada, não encontrada e integração indisponível.

## Compatibilidade

- Java 8
- Biblioteca Gradle, sem aplicação Spring Boot executável

## Build e testes

```powershell
.\gradlew.bat clean test
```

## Publicação local

```powershell
.\gradlew.bat publishToMavenLocal
```

Artefato:

```text
com.github.sep-es-br:openpmo-plugin-user-a-identify-interface:v2.0.0
```

## Implementações

A implementação GOVES está no projeto `openpmo-plugin-publicIdentity_check-goves`.

## Licença

Este projeto é distribuído sob a licença GNU General Public License v3.0. Consulte o arquivo [LICENSE](LICENSE).
