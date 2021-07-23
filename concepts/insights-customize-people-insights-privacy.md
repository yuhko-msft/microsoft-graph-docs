---
title: "Customizing people insights privacy in Microsoft Graph"
description: "The overview of customization of people insights on the organization level"
author: "alkirich"
localization_priority: Priority
ms.prod: "insights"
ms.custom: scenarios:getting-started
---

# Customizing people insights (working-with feature) privacy in Microsoft Graph (preview)

People insights are relationships that Microsoft calculates using advanced machine learning techniques. When users collaborate over documents, SharePoint sites and lists, Teams chats and channels, Microsoft aggregates these activities as signals. From the signals Microsoft derives insights to make user-centric recommendations for users in an organization, as described in the [implementation of the working-with feature](/graph/people-example#implementation-of-the-working-with-feature).

These are some of the experience that Working With appears:
  * People Card in
    * Outlook
    * SharePoint
    * Office.com
    * Bing
  * Delve
By turning off Working With a user's page will not have the list appearing in the above mentioned experiences. Working With data will not be generated if the feature is disabled.


## People insights privacy 

People insights privacy settings provide the ability to configure the visibility of insights derived from Microsoft Graph, between the subject user and other people in organization, in Microsoft 365. You can disable the Delve app via the pre-existing controls, but allow other insights-based experiences to continue to provide assistance.

## Background

TBD

## How to customize people insights?

Administrators can disable people insights for an entire organization, or for only members of a specified Azure AD group. They can configure people insights by using Microsoft Graph REST API with due permissions. Keep in mind that the _global administrator role_ is required. 

### Configure people insights using REST API
As stated earlier, by default, people insights privacy settings are enabled for the entire organization. These settings are exposed through a navigation property named **peopleInsights** in [organizationSettings](/graph/api/resources/organizationsettings?view=graph-rest-beta&preserve-view=true). You can change the default in one of two ways:

- Disable people insights for all users in the organization, by setting the **isEnabledInOrganization** property of the [peopleInsightsSettings](/graph/api/resources/peopleinsightssettings?view=graph-rest-beta&preserve-view=true) resource to `false`. 
- Disable people insights for a _subset_ of users, by assigning these users in an Azure AD group, and setting the **disabledForGroup** property to the ID of that group. Find out more about [creating a group and adding users as members](/azure/active-directory/fundamentals/active-directory-groups-create-azure-portal). 

Use the [update](/graph/api/peopleinsightssettings-update?view=graph-rest-beta&preserve-view=true) operation to set the **isEnabledInOrganization** and **disabledForGroup** properties accordingly.

| How people insights are enabled | isEnabledInOrganization | disabledForGroup |
|:-------------|:------------|:------------|
| Entire organization (default) | `true` | empty |
| Disabled for a subset of users in the organization | `true` | ID of the Azure AD group which contains the subset of users |
| Disabled for the entire organization | `false` | ignored |

Keep the following in mind when updating people insights settings:
- [People insights settings](/graph/api/resources/peopleinsightssettings?view=graph-rest-beta&preserve-view=true) are available only in the beta endpoint.
- Get the ID of an Azure AD group from the Azure portal, and make sure the group exists, because the update operation does not check the existence of the group. Specifying a non-existent group in **disabledForGroup** does _not_ disable insights for any users in the organization.
- Updating settings can take up to 24 hours to be applied across all Microsoft 365 experiences.
- Regardless of people insights settings, Delve continues to respect Delve tenant and user level [privacy settings](/sharepoint/delve-for-office-365-admins#control-access-to-delve-and-related-features?view=graph-rest-beta&preserve-view=true).

## See also
Learn more about Delve and using Delve feature settings to control documents showing up in the **Discover** feed: 
- [Connect and collaborate in Office Delve](https://support.microsoft.com/office/connect-and-collaborate-in-office-delve-46f92806-b52c-4187-b60e-b3bf8d25f73e)
- [Delve for admins](/sharepoint/delve-for-office-365-admins)
