import { registerPlugin } from '@capacitor/core';

import type { AndroidPostNotificationsPermissionPlugin } from './definitions';

const AndroidPostNotificationsPermission = registerPlugin<AndroidPostNotificationsPermissionPlugin>('AndroidPostNotificationsPermission', {
  web: () => import('./web').then(m => new m.AndroidPostNotificationsPermissionWeb()),
});

export * from './definitions';
export { AndroidPostNotificationsPermission };
