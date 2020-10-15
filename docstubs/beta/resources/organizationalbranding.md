---
title: "organizationalBranding resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# organizationalBranding resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [organizationalBrandingProperties](organizationalbrandingproperties.md)

## Methods

| Method                                                                        | Return Type                                                    | Description                                                                                  |
| :---------------------------------------------------------------------------- | :------------------------------------------------------------- | :------------------------------------------------------------------------------------------- |
| [List organizationalBranding](../api/organizationalbranding-list.md)          | [organizationalBranding](organizationalBranding.md) collection | List properties and relationships of an organizationalBranding object.                       |
| [Create organizationalBranding](../api/organizationalbranding-create.md)      | [organizationalBranding](organizationalBranding.md)            | Create a new organizationalBranding object.                                                  |
| [Get organizationalBranding](../api/organizationalbranding-get.md)            | [organizationalBranding](organizationalBranding.md)            | Read properties and relationships of an organizationalBranding object.                       |
| [Update organizationalBranding](../api/organizationalbranding-update.md)      | [organizationalBranding](organizationalBranding.md)            | Update the properties of an organizationalBranding object.                                   |
| [Delete organizationalBranding](../api/organizationalbranding-delete.md)      |                                                                | Delete an organizationalBranding object.                                                     |
| [List localizations](../api/organizationalbranding-list-localizations.md)     | organizationalBrandingLocalization                             | Get the organizationalBrandingLocalization objects from a localizations navigation property. |
| [Create localizations](../api/organizationalbranding-post-localizations.md)   | organizationalBrandingLocalization                             | Create a new organizationalBrandingLocalization object.                                      |
| [Get localizations](../api/organizationalbranding-get-localizations.md)       | organizationalBrandingLocalization                             | Read the properties and relationships of an organizationalBrandingLocalization object.       |
| [Update localizations](../api/organizationalbranding-update-localizations.md) | organizationalBrandingLocalization                             | Update the properties of an organizationalBrandingLocalization object.                       |
| [Delete localizations](../api/organizationalbranding-delete-localizations.md) |                                                                | Delete an organizationalBrandingLocalization object.                                         |

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

| Relationship  | Type                                                                                                | Description |
| :------------ | :-------------------------------------------------------------------------------------------------- | :---------- |
| localizations | [organizationalBrandingLocalization](../resources/organizationalbrandinglocalization.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.organizationalBranding",
  "baseType": "microsoft.graph.organizationalBrandingProperties",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.organizationalBranding",
  "backgroundColor": "String",
  "backgroundImage": "Stream",
  "bannerLogo": "Stream",
  "id": "String (identifier)",
  "signInPageText": "String",
  "squareLogo": "Stream",
  "usernameHintText": "String"
}
```
