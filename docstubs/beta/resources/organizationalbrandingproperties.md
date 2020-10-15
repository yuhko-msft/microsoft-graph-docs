---
title: "organizationalBrandingProperties resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# organizationalBrandingProperties resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                       | Return Type                                                                        | Description                                                                      |
| :------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------- | :------------------------------------------------------------------------------- |
| [List organizationalBrandingProperties](../api/organizationalbrandingproperties-list.md)     | [organizationalBrandingProperties](organizationalBrandingProperties.md) collection | List properties and relationships of an organizationalBrandingProperties object. |
| [Create organizationalBrandingProperties](../api/organizationalbrandingproperties-create.md) | [organizationalBrandingProperties](organizationalBrandingProperties.md)            | Create a new organizationalBrandingProperties object.                            |
| [Get organizationalBrandingProperties](../api/organizationalbrandingproperties-get.md)       | [organizationalBrandingProperties](organizationalBrandingProperties.md)            | Read properties and relationships of an organizationalBrandingProperties object. |
| [Update organizationalBrandingProperties](../api/organizationalbrandingproperties-update.md) | [organizationalBrandingProperties](organizationalBrandingProperties.md)            | Update the properties of an organizationalBrandingProperties object.             |
| [Delete organizationalBrandingProperties](../api/organizationalbrandingproperties-delete.md) |                                                                                    | Delete an organizationalBrandingProperties object.                               |

## Properties

| Property         | Type   | Description |
| :--------------- | :----- | :---------- |
| backgroundColor  | String |             |
| backgroundImage  | Stream |             |
| bannerLogo       | Stream |             |
| id               | String | Read-only.  |
| signInPageText   | String |             |
| squareLogo       | Stream |             |
| usernameHintText | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.organizationalBrandingProperties",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.organizationalBrandingProperties",
  "backgroundColor": "String",
  "backgroundImage": "Stream",
  "bannerLogo": "Stream",
  "id": "String (identifier)",
  "signInPageText": "String",
  "squareLogo": "Stream",
  "usernameHintText": "String"
}
```
