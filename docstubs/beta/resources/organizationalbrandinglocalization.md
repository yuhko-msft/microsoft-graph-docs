---
title: "organizationalBrandingLocalization resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# organizationalBrandingLocalization resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [organizationalBrandingProperties](organizationalbrandingproperties.md)

## Methods

| Method                                                                                           | Return Type                                                                            | Description                                                                        |
| :----------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------- |
| [List organizationalBrandingLocalization](../api/organizationalbrandinglocalization-list.md)     | [organizationalBrandingLocalization](organizationalBrandingLocalization.md) collection | List properties and relationships of an organizationalBrandingLocalization object. |
| [Create organizationalBrandingLocalization](../api/organizationalbrandinglocalization-create.md) | [organizationalBrandingLocalization](organizationalBrandingLocalization.md)            | Create a new organizationalBrandingLocalization object.                            |
| [Get organizationalBrandingLocalization](../api/organizationalbrandinglocalization-get.md)       | [organizationalBrandingLocalization](organizationalBrandingLocalization.md)            | Read properties and relationships of an organizationalBrandingLocalization object. |
| [Update organizationalBrandingLocalization](../api/organizationalbrandinglocalization-update.md) | [organizationalBrandingLocalization](organizationalBrandingLocalization.md)            | Update the properties of an organizationalBrandingLocalization object.             |
| [Delete organizationalBrandingLocalization](../api/organizationalbrandinglocalization-delete.md) |                                                                                        | Delete an organizationalBrandingLocalization object.                               |

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
  "@odata.type": "microsoft.graph.organizationalBrandingLocalization",
  "baseType": "microsoft.graph.organizationalBrandingProperties",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.organizationalBrandingLocalization",
  "backgroundColor": "String",
  "backgroundImage": "Stream",
  "bannerLogo": "Stream",
  "id": "String (identifier)",
  "signInPageText": "String",
  "squareLogo": "Stream",
  "usernameHintText": "String"
}
```
